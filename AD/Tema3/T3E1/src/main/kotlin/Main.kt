import java.io.DataInputStream
import java.io.FileInputStream
import java.io.RandomAccessFile

fun main(args: Array<String>) {
    val f = DataInputStream(FileInputStream("Rutes.dat"))

    while (f.available() > 0) {
        println("Ruta: ${f.readUTF()}")
        println("Desnivell: ${f.readInt()}")
        println("Desnivell acumulat: ${f.readInt()}")
        val nPunts = f.readInt()
        println("Té $nPunts punts")
        for (i in 1..nPunts) {
            println("Punt $i: ${f.readUTF()} (${f.readDouble()}, ${f.readDouble()})")
        }

        println()
    }

}