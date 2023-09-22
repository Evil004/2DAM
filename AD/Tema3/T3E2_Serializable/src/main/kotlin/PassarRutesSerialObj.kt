import java.io.DataInputStream
import java.io.FileInputStream
import java.io.FileOutputStream
import java.io.ObjectOutputStream

fun main(args: Array<String>) {
    val fIn = DataInputStream(FileInputStream("Rutes.dat"))
    val fOut = ObjectOutputStream(FileOutputStream("Rutes.obj"))

    while (fIn.available() > 0) {
        val nom = fIn.readUTF()
        val desnivell = fIn.readInt()
        val desnivellAcumulat = fIn.readInt()
        val nPunts = fIn.readInt()

        val llistaDePunts: MutableList<PuntGeo> = mutableListOf();

        for (i in 1..nPunts) {
            val nom = fIn.readUTF()
            val coordenades = Coordenades(fIn.readDouble(), fIn.readDouble())

            val punt = PuntGeo(nom, coordenades)

            llistaDePunts.add(punt)
        }
        val ruta = Ruta(nom, desnivell, desnivellAcumulat, llistaDePunts)

        ruta.mostrarRuta()
        println()
        fOut.writeObject(ruta)

    }

    fOut.close()
    fIn.close()
}