package Part1

fun main(args: Array<String>) {
    sumaDeNums(3, 4)
    calculosCuadrado(50)
    mediaDeTresPesos(23.6f, 24.8f, 78.2f)
}

private fun sumaDeNums(num1: Int, num2: Int) {


    val sum = num1 + num2
    println(sum)

    val mult = num1 * num2
    println(mult)
}

fun calculosCuadrado(side: Int) {
    val surface = side * side
    val perimeter = side * 4

    println("La superficie del cuadrado con lado $side es $surface y el perimetro $perimeter")
}

fun mediaDeTresPesos(weight1: Float, weight2: Float, weight3: Float) {
    val averageWeigh = (weight1 + weight2 + weight3) / 3

    println("La media de pesos es: $averageWeigh")
}