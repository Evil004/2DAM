
interface Imprimible{
    fun imprimir();
}

class Punto(val x: Int, val y: Int):Imprimible{
    override fun imprimir() {
        println("Punto ($x, $y)")
    }

}

fun main() {
    val punto = Punto(2,6)
    punto.imprimir()
}