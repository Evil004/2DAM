package Part1

fun main() {
    println("La sume de 2, 6 y 8 es ${sumDe2a5Valores(2, 6, 8)}")
    println("La suma de 6, 9 es ${sumDe2a5Valores(6,9)}")
}

private fun sumDe2a5Valores(n1: Int, n2: Int, n3: Int = 0, n4: Int = 0, n5: Int = 0) = n1 + n2 + n3 + n4 + n5;