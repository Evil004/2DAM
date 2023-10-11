package Part1

import askForInt

fun main() {
    //ejercicio1()
    problema2()
}

private fun ejercicio1() {
    val num = askForInt("Introduce un numero: ")

    when {
        num < 0 -> {
            println("El numero es negativo")
        }

        num == 0 -> {
            println("El numero es 0")
        }

        num > 0 -> {
            println("El numero es positivo")
        }
    }

}

private fun problema2(){

    var sum = 0;

    for (i in 0..<3){
        sum += askForInt("Introduce una nota: ")
    }

    val avg = sum/3;

    when {
        avg >=7 -> {
            println("Promocionado")
        }
        avg in 4..6 -> {
            println("Regular")
        }
        avg < 4 -> {
            println("Reprobado")
        }
    }

}

