package Part2

data class Dado(val valor: Int) {

    override fun toString(): String {
        var cadena = ""
        for (i in 0..<valor) {
            cadena += "*"
        }

        return cadena;
    }
}

fun main() {
    val dado1 = Dado(1)
    val dado2 = Dado(2)
    val dado3 = Dado(3)
    val dado4 = Dado(4)
    val dado5 = Dado(5)
    val dado6 = Dado(6)

    println(dado1)
    println(dado2)
    println(dado3)
    println(dado4)
    println(dado5)
    println(dado6)
}