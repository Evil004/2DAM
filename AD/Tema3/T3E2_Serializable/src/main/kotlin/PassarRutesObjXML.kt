import java.io.*
import javax.xml.parsers.DocumentBuilderFactory
import javax.xml.transform.TransformerFactory
import javax.xml.transform.dom.DOMSource
import javax.xml.transform.stream.StreamResult

fun main() {
    val fIn = ObjectInputStream(FileInputStream("Rutes.obj"))

    val doc = DocumentBuilderFactory.newInstance().newDocumentBuilder().newDocument()
    val arrel = doc.createElement("rutas")

    doc.appendChild(arrel)

    try {
        while (true) {
            val r = fIn.readObject() as Ruta

            val ruta = doc.createElement("ruta")
            val rutaNom = doc.createElement("nom")
            rutaNom.appendChild(doc.createTextNode(r.nom))
            ruta.appendChild(rutaNom)

            val rutaDesnivell = doc.createElement("desnivell")
            rutaDesnivell.appendChild(doc.createTextNode(r.desnivell.toString()))
            ruta.appendChild(rutaDesnivell)


            val rutaDesnivellAcumulat = doc.createElement("desnivellAcumulat")
            rutaDesnivellAcumulat.appendChild(doc.createTextNode(r.desnivellAcumulat.toString()))
            ruta.appendChild(rutaDesnivellAcumulat)


            val punts = doc.createElement("punts")

            for (i in 1.. r.size()){
                val p = r.llistaDePunts[i-1]
                val punt = doc.createElement("punt")
                punt.setAttribute("num", i.toString());

                val puntNom = doc.createElement("nom")
                puntNom.appendChild(doc.createTextNode(p.nom))

                punt.appendChild(puntNom)

                val puntLatitud = doc.createElement("latitud")
                puntLatitud.appendChild(doc.createTextNode(p.coord.latitud.toString()))
                punt.appendChild(puntLatitud)

                val puntLongitud = doc.createElement("longitud")
                puntLongitud.appendChild(doc.createTextNode(p.coord.longitud.toString()))
                punt.appendChild(puntLongitud)


                punts.appendChild(punt)

            }

            ruta.appendChild(punts)

            arrel.appendChild(ruta)

        }
    } catch (eof: EOFException) {
        fIn.close()
    }
    val trans = TransformerFactory.newInstance().newTransformer()

    trans.transform(DOMSource(doc), StreamResult("Rutas.xml"))

}