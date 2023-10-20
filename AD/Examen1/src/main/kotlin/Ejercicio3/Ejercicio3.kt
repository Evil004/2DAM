package Ejercicio3

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.DataInputStream
import java.io.FileInputStream
import java.io.FileReader
import java.io.FileWriter

fun main() {

    val f = DataInputStream(FileInputStream("datos.dat"))
    val f2 = BufferedReader(FileReader("datos.txt"))
    val fo = FileWriter("resumen.txt")

    while (f.available()>0){
        val nombre = f2.readLine()
        val cadena = "$nombre: ${f.readFloat()}m. - ${f.readInt()}kg."
        println(cadena)

        fo.write(cadena+"\n")

    }
    f.close()
    f2.close()
    fo.close()
}