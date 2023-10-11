package Part2

import askForInt
import askForString

private class Alumno(nombre: String, nota: Int){
    var nombre:String = nombre;
    var nota = nota;

    fun inicializar(){
        nombre = askForString("Introduce el nombre:")
        nota = askForInt("Introduce la nota:")
    }

    fun mostrarEstado(){
        if (nota >=4){
            println("La nota de $nombre es regular")
        }else{
            println("La nota de $nombre es mejor que regular")
        }
    }
}

fun main(){
    val alumno = Alumno("Juan", 6)
    val otroAlumno = Alumno("Pablo", 3)

    alumno.mostrarEstado()
    otroAlumno.mostrarEstado()

    val p1 = Punto(2, 3)
    println(p1.getQuadrant().s)
    val p2 = Punto(-2, 3)
    println(p2.getQuadrant().s)

    val p3 = Punto(2, -3)
    println(p3.getQuadrant().s)
    val p4 = Punto(-2, -3)
    println(p4.getQuadrant().s)
    val p5 = Punto(0, 0)
    println(p5.getQuadrant().s)

}


enum class Quadrant(val s: String) {
    First("1er quadrant"),
    Second("2nd quadrant"),
    Third("3rd quadrant"),
    Forth("4th quadrant"),
    Axis("Axis");


}

class Punto(val x: Int, val y: Int) {

    fun getQuadrant(): Quadrant {
        if (x > 0 && y > 0) {
            return Quadrant.First
        }
        if (x < 0 && y > 0) {
            return Quadrant.Second
        }
        if (x < 0 && y < 0) {
            return Quadrant.Third
        }
        if (x > 0 && y < 0) {
            return Quadrant.Forth
        }

        return Quadrant.Axis
    }
}
