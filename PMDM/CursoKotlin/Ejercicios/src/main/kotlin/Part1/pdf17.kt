package Part1

fun main() {
    problema1()
    problema2()
}

private fun problema2(){
    println("El perimotro del cuadrado de lado 5 es: ${getPerimeter(5)}")
}

private fun getPerimeter(side: Int) =side*4

private fun problema1() {

    println("La media es: ${getMedia(2, 6, 1)}")
}

private fun getMedia(n1: Int, n2: Int, n3: Int) = (n1 + n2 + n3) / 3
