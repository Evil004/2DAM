package com.oscar.elsol

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Build
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Face
import androidx.compose.material.icons.filled.Info
import androidx.compose.material3.Badge
import androidx.compose.material3.BadgedBox
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.DrawerState
import androidx.compose.material3.DrawerValue
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.ModalDrawerSheet
import androidx.compose.material3.ModalNavigationDrawer
import androidx.compose.material3.NavigationDrawerItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.SnackbarHost
import androidx.compose.material3.SnackbarHostState
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.rememberDrawerState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.oscar.elsol.ui.theme.ElSolTheme
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.launch

class MainActivity : ComponentActivity() {
    @SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
    @OptIn(ExperimentalMaterial3Api::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ElSolTheme {

                // A surface container using the 'background' color from the theme
                val drawerState = rememberDrawerState(initialValue = DrawerValue.Closed)
                val scope = rememberCoroutineScope()
                val navController = rememberNavController()
                var currentScreen by remember {
                    mutableStateOf("Build")
                }
                val snackbarHostState = remember { SnackbarHostState() }


                Scaffold(
                bottomBar ={ BottomBar(drawerState, scope) },
                    snackbarHost = { SnackbarHost(hostState = snackbarHostState) }
                ) {



                    ModalNavigationDrawer(
                        drawerState = drawerState,
                        drawerContent = {
                            ModalDrawerSheet() {
                                Image(
                                    painter = painterResource(id = R.drawable.solar_full),
                                    contentDescription = ""
                                )

                                NavigationDrawerItem(
                                    label = {

                                        Text(text = "Build")
                                    },
                                    icon = {
                                        Icon(Icons.Filled.Build, contentDescription = "")
                                    },
                                    selected = currentScreen == "Build",
                                    onClick = {
                                        navController.navigate("Build")
                                        currentScreen = "Build"
                                        scope.launch {
                                            drawerState.close()

                                        }

                                    },
                                    modifier = Modifier.padding(start = 10.dp, end = 10.dp, top = 10.dp)
                                )
                                NavigationDrawerItem(
                                    label = {

                                        Text(text = "Info")
                                    },
                                    icon = {
                                        Icon(Icons.Filled.Info, contentDescription = "")
                                    },
                                    selected = currentScreen == "Info",
                                    onClick = {
                                        navController.navigate("Info")
                                        currentScreen = "Info"
                                        scope.launch {
                                            drawerState.close()

                                        }
                                    },
                                    modifier = Modifier.padding(start = 10.dp, end = 10.dp, top = 10.dp)
                                )
                                NavigationDrawerItem(
                                    label = {
                                        Text(text = "Email")
                                    },
                                    icon = {
                                        Icon(Icons.Filled.Email, contentDescription = "")
                                    },
                                    selected = currentScreen == "Email",
                                    onClick = {
                                        navController.navigate("Email")
                                        currentScreen = "Email"
                                        scope.launch {
                                            drawerState.close()

                                        }
                                    },

                                    modifier = Modifier.padding(start = 10.dp, end = 10.dp, top = 10.dp)
                                )

                            }
                        }
                    ) {
                        Surface(
                            modifier = Modifier.fillMaxSize(),
                            color = MaterialTheme.colorScheme.background
                        ) {
                            NavHost(navController = navController, startDestination = "Build") {
                                composable("Build") {
                                    MainMenu(snackbarHostState, scope = scope)
                                }
                                composable("Info") {
                                }
                                composable("Email") {
                                }
                            }
                        }
                    }

                }

            }
        }
    }
}

@Composable
@OptIn(ExperimentalMaterial3Api::class)
private fun BottomBar(drawerState: DrawerState, scope: CoroutineScope) {

    var likes by remember {
        mutableStateOf(0)
    }

    BottomAppBar(
        containerColor = Color.Red,
        actions = {

        IconButton(onClick = {
            scope.launch {
                drawerState.apply {
                    if (isClosed) open() else close()
                }
            }
        }) {
            Icon(Icons.Filled.ArrowBack, contentDescription = "",
                tint = Color.White,
                )
        }

        BadgedBox(badge = {
            if (likes > 0) {
                Badge() {
                    Text(text = likes.toString())
                }
            }

        }
        ) {
            /*IconButton(onClick = { likes++ }) {
                Icon(Icons.Filled.Face, contentDescription = "")
            }*/
            Icon(
                Icons.Filled.Face,
                modifier = Modifier.clickable { likes++ },
                tint = Color.White,
                contentDescription = ""
            )

        }


    }, floatingActionButton = {
        FloatingActionButton(onClick = { /*TODO*/ }) {
            Icon(Icons.Filled.Add, contentDescription = "")
        }
    })
}


