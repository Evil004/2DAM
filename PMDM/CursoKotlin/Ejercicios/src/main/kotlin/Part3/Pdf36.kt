package Part3

class Persona(val nombre: String, val edad: Int){
    fun mayorDeEdad(fn: (Int) -> Boolean): Boolean{
        return fn(edad)
    }


}
val MAYORIA_EDAD_ESPANA = 18
val MAYORIA_EDAD_ESTADOS_UNIDOS = 21

fun mayorEspana(edad:Int):Boolean{
    return edad >= MAYORIA_EDAD_ESPANA
}

fun mayorEstadosUnidos(edad:Int):Boolean{
    return edad >= MAYORIA_EDAD_ESTADOS_UNIDOS
}
fun main() {
    val persona1 = Persona("Juan", 18)
    val persona2 = Persona("Pedro", 19)

    println(persona1.mayorDeEdad(::mayorEspana))
    println(persona2.mayorDeEdad(::mayorEstadosUnidos))
}