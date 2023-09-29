package Part2

import askForInt

private const val MIN_NUM = 1
private const val MAX_NUM = 999
private const val EXIT_NUM = 0


private const val MAX_NUM_EJ1 = 9999
private const val EXIT_NUM_EJ1 = 0

fun main() {
    //problema1()
    //problema2()
    ejercicio1()
}

private fun ejercicio1() {
    var sum = 0;
    do {
        val num = askForInt("Introduce un numero mayor a $MAX_NUM_EJ1 (Introduce $EXIT_NUM para salir)")

        if (num == EXIT_NUM) {
            break
        }

        if (!inRange_ej1(num)) {
            continue
        }

        sum += num;

    } while (num != EXIT_NUM_EJ1)

    val numType = if (sum > 0) {
        "mayor a cero"
    } else if (sum == 0) {
        "Igual a cero"
    } else {
        "menor a cero"
    }

    println("El total es $sum y es $numType")
}

private fun inRange_ej1(num: Int): Boolean {
    return num < MAX_NUM_EJ1
}

private fun problema2() {
    var sum = 0;
    var cant = 0;
    var media = 0.0;
    do {
        println("Llevas una media de: $media")
        val num = askForInt("Introduce un numero ($EXIT_NUM para salir): ")
        if (num != EXIT_NUM) {
            sum += num
            cant++
            media = (sum.toDouble() / cant.toDouble())
        }

    } while (num != EXIT_NUM)
}

private fun problema1() {
    do {
        val num = askForInt("Introduce un numero entre $MIN_NUM y $MAX_NUM (Introduce $EXIT_NUM para salir)")

        if (!inRange(num)) {
            continue
        }

        val digits = num.toString().length;
        println("El numero $num tiene $digits digito")
    } while (num != 0)
}

private fun inRange(num: Int): Boolean {
    return num in MIN_NUM..MAX_NUM
}

