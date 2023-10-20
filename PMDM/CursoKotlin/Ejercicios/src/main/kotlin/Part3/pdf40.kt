package Part3

fun String.imprimir() {
    println(this)
}

fun Int.hasta(fin: Int) {
    for (i in this..fin) {
        println(i)
    }
}

fun main() {
    "Hola".imprimir()
    val s = "aaaa"
    s.imprimir()

    4.hasta(12)
    val a = 23
    a.hasta(45)
}