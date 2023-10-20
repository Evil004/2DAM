
open class Dado {

    var valor = 0;
    fun tirar(){
        valor = ((Math.random()*6)+1).toInt()
    }

    open fun imprimir(){
        println(valor)
    }
}
class DadoRecuadro(): Dado(){


    override fun imprimir(){
        println("*********")
        for (i in 0..<3){
            println("*       *")
        }
        println("*   $valor   *")
        for (i in 0..<3){
            println("*       *")
        }
        println("*********")

    }
}

fun main() {
    val dado = DadoRecuadro()

    dado.tirar()
    dado.imprimir()
}

