package Part2

import askForInt

fun main() {
    problema1()
    problema2()
}

private fun problema1() {
    askForIntAndPrintsItsSquare()
    askFor2IntsAndPrintTheProduct()
}

private fun askForIntAndPrintsItsSquare() {
    val num = askForInt("Introduce un num:");
    println("Su cuadrado es: ${num * num}")
}

private fun askFor2IntsAndPrintTheProduct() {
    val num1 = askForInt("Introduce un num:");
    val num2 = askForInt("Introduce un num:");

    println("El producto de los 2 nums es: ${num1 * num2}")
}


private fun problema2() {
    askFor3IntsAndPrintTheBigger()
}

private fun askFor3IntsAndPrintTheBigger() {
    val num1 = askForInt("Introduce un num: ")
    val num2 = askForInt("Introduce otro num: ")
    val num3 = askForInt("Introduce un numero más: ")

    val bigger = getBiggerOf3(num1, num2, num3)

    println("El numer más grande es $bigger")
}

private fun getBiggerOf3(num1: Int, num2: Int, num3: Int): Int {
    val bigger = if (num1 > num2 && num1 > num3) num1 else
        if (num2 > num1 && num2 > num3) num2 else num3;
    return bigger
}