fun main() {
    val sons = Sons();

    sons.cargar()

}

class Sons {

    companion object {
        const val sonsNumb = 5;
    }

    var sonsList: Array<Son?> = arrayOfNulls<Son>(5);

    fun cargar() {
        for (i in 0..<sonsNumb) {
            val age = askForInt("Introduce la edad del hijo #$i")
            val son = Son(age)

            sonsList[i] = son
        }

        println("El hijo más mayor tiene ${getOlder().age} años")

        println("Entre todos tienen una media de ${getAvgAge()}")
    }

    fun getOlder(): Son {

        var older = sonsList[0];


        for (i in 1..<sonsList.size) {
            if (older?.age!! < sonsList[i]?.age!!) {
                older = sonsList[i];
            }
        }

        return older!!;
    }

    fun getAvgAge(): Int {
        var totalAge = 0;

        for (son in sonsList) {

            totalAge += son?.age!!;
        }

        return totalAge / sonsList.size;
    }
}

class Son(val age: Int)
