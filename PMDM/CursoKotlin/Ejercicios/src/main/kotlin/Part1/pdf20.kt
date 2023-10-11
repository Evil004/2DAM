package Part1

import askForInt

fun main() {


    fun mayor (n1: Int, n2: Int) = if (n1 > n2) n1 else n2


    for (i in 1..5){
        val n1 = askForInt("Introduce el primer valor:")
        val n2 = askForInt("Introduce el segundo valor:")

        println("El mayor de los dos es: ${mayor(n1,n2)}")
    }
}

