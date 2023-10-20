package Ejercicio1

import java.io.File

fun main() {
    println("Introduce una ruta: ")
    val path = readln()

    var file = File(path)

    if (!file.isDirectory) {
        println("No es un directorio")
        return;
    }

    println("Lista de ficheros y directorios de la ruta: $path")

    println("----------------------------------------")

    var numFiles = 0;
    var numDirs = 0;
    var bigger = File("");
    var totalSize: Long = 0;

    var t1 = System.nanoTime();
    for (file in file.walk()!!) {
        if (file.isFile) {
            numFiles++
            totalSize += file.length();

            if (file.length() > bigger.length()) {
                bigger = file;
            }
        };
        if (file.isDirectory) numDirs++;


    }

    var t2 = System.nanoTime();
    val tt = ((t2 - t1)) / 1.0e9;
    System.out.println("Tiempo Transcurrido en segs.:" + tt);


    println("Numero de fucheros $numFiles")
    println("Numero de directorios $numDirs")
    println("Tamaño total de los ficheros ${totalSize}")
    println("El fichero con más tamaños es: ${bigger.name} y tiene de tamaño ${bigger.length()}")
}