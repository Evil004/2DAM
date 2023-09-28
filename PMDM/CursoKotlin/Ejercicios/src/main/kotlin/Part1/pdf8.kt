package Part1

import askForInt
import askForInts

fun main(args: Array<String>) {
    //problema 1: Va a ser el mismo que el problema 1 del pdf7
    problema2()
    ejercicio1()
    ejercicio2()
    ejercicio3()
    ejercicio4()
    ejercicio5()
    ejercicio6()

}

private fun ejercicio6() {
    val nums = askForInts(3)
    val min = getMin(nums)
    val max = getMax(nums)

    println("El numero mas grande es $max y el mas pequeño es $min")
}

fun getMax(nums: ArrayList<Int>): Any {
    var max = Int.MIN_VALUE
    for (num in nums) {
        if (num > max) max = num
    }
    return max
}

fun getMin(nums: ArrayList<Int>): Any {
    var max = Int.MAX_VALUE
    for (num in nums) {
        if (num < max) max = num
    }
    return max
}

private fun ejercicio5() {

    val x = askForInt("Introduce la coordenada X: ")
    val y = askForInt("Introduce la coordenada Y: ")

    val cuadrante = getCuadrante(x, y)

    if (cuadrante == 0) {
        println("El punto se encuentra en un eje")
        return
    }

    println("El punto se encuentra en el cuadrante $cuadrante")

}

private fun getCuadrante(x: Int, y: Int): Int {
    if (isInFirstQuadrant(x, y)) {
        return 1
    } else if (isInSecondQuadrant(x, y)) {
        return 2
    } else if (isInThirdQuadrant(x, y)) {
        return 3
    } else if (isInFourthQuadrant(x, y)) {
        return 4
    } else {
        return 0
    }
}

private fun isInFourthQuadrant(x: Int, y: Int) = x > 0 && y < 0

private fun isInThirdQuadrant(x: Int, y: Int) = x < 0 && y < 0

private fun isInSecondQuadrant(x: Int, y: Int) = x < 0 && y > 0

private fun isInFirstQuadrant(x: Int, y: Int) = x > 0 && y > 0

private fun ejercicio4() {
    val nums = askForInts(3)

    if (isAnumberLessThan10(nums)) {
        println("Hay un numero menor a 10")
    } else {
        println("NO hay un numero menor a 10")
    }

}

private fun isAnumberLessThan10(nums: ArrayList<Int>): Boolean {
    for (num in nums) {
        if (num < 10) return true
    }
    return false
}

private fun ejercicio3() {
    val nums = askForInts(3)

    if (areAllLessThan10(nums)) {
        println("Todos los numeros son menores a 10")
    } else {
        println("NO todos los numeros son menores a 10")
    }

}

private fun areAllLessThan10(nums: ArrayList<Int>): Boolean {
    for (num in nums) {
        if (num > 10) return false
    }
    return true
}

private fun ejercicio2() {
    val num1 = askForInt("Introduce un nuemero:")
    val num2 = askForInt("Introduce otro nuemero:")
    val num3 = askForInt("Introduce otro nuemero:")

    if (num1 == num2 && num2 == num3) {
        println("Son todos iguales, su cubo es: ${num1 * num2 * num3}")
    }
}

private fun ejercicio1() {
    println("Introduce una fecha: ")
    val day = askForInt("dia: ")
    val month = askForInt("mes: ")
    val year = askForInt("year: ")

    if (day == 25 && month == 12) {
        println("Es navidad :D")
    } else {
        println("No es navidad D:")
    }
}

private fun problema2() {
    println("Introduce una fecha: ")
    val day = askForInt("dia: ")
    val month = askForInt("mes: ")
    val year = askForInt("year: ")

    isDateValid(day, month, year)

    if (month in 1..3) {
        println("Es el primer trimestre")
        return
    }

    println("No es el primer trimestre")
}

private fun isDateValid(day: Int, month: Int, year: Int): Boolean {
    if (day !in 1..31) {
        return false
    }

    if (month !in 1..12) {
        return false
    }

    return true
}