package Part3

fun operar(n1: Int, n2: Int, fn: (Int, Int) -> Int): Int {

    return fn(n1, n2);
}

fun main() {
    println(operar(2, 3, { a, b -> a + b }))
    println(operar(2, 3, { a, b -> a - b }))
    println(operar(2, 3, { a, b -> a * b }))
    println(operar(2, 3, { a, b -> a / b }))

}