package Examen.Ejercicio1

import java.io.File

fun main() {
    println("Introduce una ruta: ")
    val path = readln()

    var file = File(path)

    if (!file.isDirectory){
        println("No es un directorio")
    }

    println( "Lista de ficheros y directorios de la ruta: $path")
}