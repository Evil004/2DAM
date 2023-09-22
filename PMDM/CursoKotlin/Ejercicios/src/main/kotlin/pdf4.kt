import java.util.Scanner


fun main() {

    println("Suma: ${problema1()}")

    problema2()

    problema3()

    ejercicio1()

    ejercicio2()

}

private fun ejercicio1() {

    val num1 = askForInt("Introduce un numero: ")
    val num2 = askForInt("Introduce otro numero: ")
    val num3 = askForInt("Introduce otro numero: ")
    val num4 = askForInt("Introduce otro numero: ")

    println("La suma de los 2 primeros: ${sum2Nums(num1, num2)}")
    println("El producto de los 2 ultimos: ${mult2nums(num3, num4)}")
}

private fun ejercicio2() {

    val num1 = askForInt("Introduce un numero: ")
    val num2 = askForInt("Introduce otro numero: ")
    val num3 = askForInt("Introduce otro numero: ")
    val num4 = askForInt("Introduce otro numero: ")

    val sum = num1 + num2 + num3 + num4
    println("La suma de los 4 nums es: ${sum}")
    println("La media es: ${sum / 4}")

}


private fun problema3() {

    val productQuant = askForInt("Introduce la cantidad de articulos: ")
    val productPrice = askForFloat("Introduce el precio del producto: ")

    println("El total es: ${calculateTotalPrice(productQuant, productPrice)}")
}

fun mult2nums(num1: Int, num2: Int): Int {
    return num2 * num1;
}

private fun problema2() {


    val squareSide = askForInt("Introduce el lado del cuadrado: ")
    println("Area: ${calculateSquareArea(squareSide)} Perimetro: ${calculatePerimeter(squareSide)}")
}

private fun problema1(): Int {

    val firstNum = askForInt("Introduce el primer numero: ")

    val secondNum = askForInt("Introduce el segundo numero: ")


    val result = sum2Nums(firstNum, secondNum)

    return result;
}

private fun sum2Nums(firstNum: Int, secondNum: Int): Int {
    val result = firstNum + secondNum
    return result
}

private fun calculateSquareArea(side: Int): Int {
    val area = side * side

    return area;
}

private fun calculatePerimeter(side: Int): Int {
    val perimeter = side * 4

    return perimeter;
}

private fun calculateTotalPrice(quant: Int, price: Float): Float {

    val total = quant * price

    return total
}
