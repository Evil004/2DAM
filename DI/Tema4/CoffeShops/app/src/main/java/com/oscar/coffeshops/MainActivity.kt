package com.oscar.coffeshops

import android.annotation.SuppressLint
import android.os.Build
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.annotation.RequiresApi
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.ArrowDropDown
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Share
import androidx.compose.material3.DropdownMenu
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.oscar.coffeshops.ui.theme.CoffeShopsTheme

class MainActivity : ComponentActivity() {
    @SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
    @OptIn(ExperimentalMaterial3Api::class)
    @RequiresApi(Build.VERSION_CODES.Q)
    override fun onCreate(savedInstanceState: Bundle?) {


        super.onCreate(savedInstanceState)
        setContent {
            CoffeShopsTheme {
                Scaffold(topBar = { TopBar() }) {
                    Box(
                        modifier = Modifier
                            .fillMaxSize()
                            .padding(top = it.calculateTopPadding())
                    ) {

                        val navController = rememberNavController()


                        NavHost(navController = navController, startDestination = "Main") {

                            composable("Main") {
                                CoffeShopsMain(navController)
                            }
                            composable("Comments/{coffeeShop}", arguments = listOf(
                                navArgument(name = "coffeeShop") {
                                    type = NavType.StringType
                                }
                            )) { backStackEntry ->
                                val param = backStackEntry.arguments?.getString("coffeeShop")
                                CoffeComments(
                                    param
                                )
                            }

                        }

                    }

                }
            }
        }
    }

    @Composable
    @OptIn(ExperimentalMaterial3Api::class)
    private fun TopBar() {
        TopAppBar(
            title = { Text(text = "Coffee Shops") }, colors = TopAppBarDefaults.largeTopAppBarColors(
                containerColor = MaterialTheme.colorScheme.primary
            ), navigationIcon = {
                IconButton(onClick = { /*TODO*/ }) {
                    Icon(imageVector = Icons.Filled.Menu, contentDescription = "")
                }
            }, actions = {
                var extended by remember {
                    mutableStateOf(false)
                }
                IconButton(onClick = { extended = true}) {
                    Icon(imageVector = Icons.Filled.ArrowDropDown, contentDescription = "")
                }



                DropdownMenu(expanded = extended, onDismissRequest = { extended = false }) {
                    DropdownMenuItem(leadingIcon = {
                        Icon(
                            imageVector = Icons.Filled.Share, contentDescription =
                            "Compartir"
                        )
                    }, text = {

                        Text(text = "Compartir")
                    }, onClick = { extended.not()})


                    DropdownMenuItem(leadingIcon = {Icon(
                        imageVector = Icons.Filled.AccountCircle, contentDescription =
                        "Album"
                    )}, text = {

                        Text(text = "Album")
                    }, onClick = { /*TODO*/ })
                }

            }

        )
    }
}

@RequiresApi(Build.VERSION_CODES.Q)
val dancingScript = FontFamily(
    Font(R.font.dancing_script_regular, FontWeight.Normal)
)
