package Part2

abstract class Cuenta(var titular: String, var monto: Float) {

    open fun imprimir(){
        println("Titular $titular")
        println("Monto $monto")
    }
}

class PlazoFijo(titular: String, monto: Float, val plazo: Int, val interes: Float): Cuenta(titular, monto){
    override fun imprimir() {
        super.imprimir()

        println("Plazo: $plazo")
        println("Interes: $interes")
    }
}

class CajaAhorro(titular: String, monto: Float): Cuenta(titular, monto){
    override fun imprimir() {
        println("Cuenta de caja de ahorro")
        super.imprimir()
    }
}

fun main() {
    val cajaAhorro = CajaAhorro("Juan", 2321.46f)
    cajaAhorro.imprimir()


    println()
    val plazoFijo = PlazoFijo("Juan", 2321.46f, 23, 32.4f)
    plazoFijo.imprimir()

}
