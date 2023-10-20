package Part2

class Club() {

    var socios = arrayListOf<Socio>()

    fun printOlder(){

        var olderSocio: Socio? = null

        for (socio in socios){
            if (olderSocio == null) {
                olderSocio = socio
                continue
            }

            if (olderSocio.antiguedad<socio.antiguedad){
                olderSocio = socio
            }

        }

        if (olderSocio != null) {
            println("El socio más antiguo es: ${olderSocio.nombre} con una antiguedad de: ${olderSocio.antiguedad}")
        }

    }
}


class Socio(var nombre: String, var antiguedad: Int) {

}

fun main() {
    val club = Club()

    club.socios = arrayListOf(
        Socio("Juan", 3),
        Socio("Pablo", 5),
        Socio("Marta", 1)
    );

    club.printOlder()
}