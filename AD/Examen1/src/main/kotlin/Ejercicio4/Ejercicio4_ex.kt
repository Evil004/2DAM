package Ejercicio4

import java.io.File

var numFiles = 0;
var numDirs = 1;
var bigger = File("");
var totalSize: Long = 0;

fun main() {
    println("Introduce una ruta: ")
    val path = readln()

    var mainFolder = File(path)

    if (!mainFolder.isDirectory) {
        println("No es un directorio")
        return;
    }


    println("Lista de ficheros y directorios de la ruta: $path")

    println("----------------------------------------")



    lookDirRecursive(mainFolder)

    println("Numero de fucheros $numFiles")
    println("Numero de directorios $numDirs")
    println("Tamaño total de los ficheros ${totalSize}")
    println("El fichero con más tamaños es: ${bigger.name} y tiene de tamaño ${bigger.length()}")
}

private fun lookDirRecursive(mainFolder: File) {

    for (file in mainFolder.listFiles()!!) {
        if (file.isDirectory) {
            numDirs++
            lookDirRecursive(file)
        };

        if (file.isFile) {
            numFiles++
            totalSize += file.length();

            if (file.length() > bigger.length()) {
                bigger = file;
            }
        };


    }
}