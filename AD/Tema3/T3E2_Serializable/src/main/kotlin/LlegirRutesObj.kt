import java.io.*

fun main(args: Array<String>) {
    val fIn = ObjectInputStream(FileInputStream("Rutes.obj"))


    try{
        while (true) {
            val obj = fIn.readObject() as Ruta
            obj.mostrarRuta()
            println()
        }
    } catch (eof: EOFException) {
        fIn.close()
    }

    fIn.close()

}