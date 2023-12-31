package Part2

enum class Paises(val habitantes: Int) {
    BRASIL (202450649),
    COLOMBIA (50364000),
    PERU (31151643),
    VENEZUELA (31028337),
    CHILE (18261884),
    ECUADOR (16298217),
    BOLIVIA (10888000),
    PARAGUAY (6460000),
}

fun main() {
    val pais = Paises.ECUADOR

    println("$pais:  ${pais.habitantes} habitantes")
}