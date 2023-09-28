fun askForInt(message: String): Int {

    println(message)
    return readln().toInt()
}

fun askForFloat(message: String): Float {

    println(message)
    return readln().toFloat()
}

fun askForInts(numsToAsk: Int): ArrayList<Int> {
    var marks = ArrayList<Int>()

    for (i in 1..numsToAsk) {
        val mark = askForInt("Introduce el numero Nº$i: ")
        marks.add(mark)
    }
    return marks
}