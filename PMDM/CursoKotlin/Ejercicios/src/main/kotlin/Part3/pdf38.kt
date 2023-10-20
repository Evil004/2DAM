package Part3

fun main() {
    val array = FloatArray(10) { 5f }

    for (i in 0..<10) {
        println("Introduce un numero #${i + 1}")
        array[i] = readln().toFloat()
    }

    println("Hay ${array.count { it < 50 }} numeros menores que 50")

    if (array.all { it<= 50 }) {
        println("Todos los numeros son menores que 50")
    }
}