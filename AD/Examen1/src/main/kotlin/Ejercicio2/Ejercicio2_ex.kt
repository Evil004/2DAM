package Ejercicio2

import org.json.JSONArray
import org.json.JSONObject
import org.json.JSONTokener
import java.io.FileReader


fun main() {

    val json = JSONTokener(FileReader("variacionPoblacional.json")).nextValue() as JSONArray;

    for (provincia in json) {
        if (provincia !is JSONObject) {
            continue
        }

        val provinciaObject = provincia as JSONObject;
        if (provinciaObject.get("Nombre") != "Castelló") {
            continue
        }

        printData(provinciaObject)
    }

}

private fun printData(provinciaObject: JSONObject) {
    var variacion = 0;

    for (data in provinciaObject.get("Data") as JSONArray) {
        var data = data as JSONObject

        val periodo = data.get("NombrePeriodo");
        val valor = data.get("Valor") as Int

        variacion += valor

        println("$periodo --> $valor")
    }

    println("Variación total: $variacion")
}