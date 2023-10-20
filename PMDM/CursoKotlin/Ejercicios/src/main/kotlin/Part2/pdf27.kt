package Part2

class Vector {
    private var array = IntArray(5)

    private fun generar():Int{
        return (Math.random()*11).toInt()
    }

    init {
        for (i in array.indices ){
            array[i] = generar()
        }
    }

    fun mostrarArray(){
        for (i in array){
            print("$i, ")
        }
        print("\n")
    }

    fun mostrarMenor(){
        println("El numero más pequeño es: ${array.min()}")
    }

    fun mostrarMayor(){
        println("El numero más grande es: ${array.max()}")
    }
}

fun main() {
    var vector = Vector();

    vector.mostrarArray()
    vector.mostrarMenor()
    vector.mostrarMayor()
}