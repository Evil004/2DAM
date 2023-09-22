private const val MARKS_TO_ASK = 3
private const val MAX_DIGITS = 3


fun main(args: Array<String>) {

    problema1()
    ejercicio1()
    ejercicio2()
    ejercicio3()
}


private fun ejercicio3() {
    val num = askForInt("Introduce un numero:")

    var digitsInNum = if (num<0) num.toString().length-1 else num.toString().length


    if (digitsInNum > MAX_DIGITS) {
        println("El numero tiene mas de $MAX_DIGITS digitos")
        return
    }

    println("El numero tiene $digitsInNum digitos")

}

private fun ejercicio2() {
    val num: Int? = askForInt("Introduce un numero: ")

    val type = if (num == null) {
        "nulo"
    } else if (num >= 0) {
        "positivo"
    } else {
        "negativo"
    }

    println("El numero es $type")

}

private fun ejercicio1() {

    val nums = askForInts(3)

    println("El numero más grande: ${getBigger(nums)}")
}

private fun getBigger(nums: ArrayList<Int>): Int {
    var bigger = Int.MIN_VALUE

    for (num in nums) {
        if (num > bigger) {
            bigger = num
        }
    }
    return bigger
}

private fun problema1() {

    var marks = askForInts(MARKS_TO_ASK)

    val avgMark = getAvg(marks)


    val message = getMessage(avgMark)


    println("Tienes un $avgMark de media, el mensaje es: $message")
}

private fun askForInts(numsToAsk: Int): ArrayList<Int> {
    var marks = ArrayList<Int>()

    for (i in 1..numsToAsk) {
        val mark = askForInt("Introduce el numero Nº$i: ")
        marks.add(mark)
    }
    return marks
}

private fun getMessage(avgMark: Int): String {
    val message = if (avgMark >= 7) {
        "Promocionado"
    } else if (avgMark >= MAX_DIGITS) {
        "Regular"
    } else {
        "Reprobado"
    }
    return message
}

private fun getAvg(nums: List<Int>): Int {
    val result = nums.sum() / nums.size;

    return result;
}