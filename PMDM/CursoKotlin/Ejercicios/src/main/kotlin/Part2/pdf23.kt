package Part2

import askForInt
import askForString



fun main(){
    //Lo meto en el main para que no me de problemas de clase ya declarada
    class Alumno(){
        var nombre:String = "";
        var nota = 0;

        fun inicializar(){
            nombre = askForString("Introduce el nombre:")
            nota = askForInt("Introduce la nota:")
        }

        fun mostrarEstado(){
            if (nota >=4){
                println("La nota es regular")
            }else{
                println("La nota es mejor que regular")
            }
        }
    }

    val alumno = Alumno()
    val otroAlumno = Alumno()

    alumno.inicializar()
    otroAlumno.inicializar()

    alumno.mostrarEstado()
    otroAlumno.mostrarEstado()
}