private const val MIN_FOR_TAXES = 3000


fun main(args: Array<String>) {
    problema1()
    problema2()
    problema3()

    ejercicio1()
    ejercicio2()
}

private fun ejercicio1() {
    val note1 = askForInt("Introduce la nota 1")
    val note2 = askForInt("Introduce la nota 2")
    val note3 = askForInt("Introduce la nota 3")

    if (canPromote(note1, note2, note3)) {
        println("Puedes promocionar")
    } else {
        println("No puedes promocionar :(")
    }
}

private fun ejercicio2(){
    val number = askForInt("Introduce un numero del 1 al 100")

    if (has2Digits(number)) {
        println("Tiene 2 digitos :D")
    } else {
        println("No tiene 2 digitos :(")
    }
}

private fun has2Digits(num:Int): Boolean{
    return num in 10..99;
}

private fun canPromote(note1: Int, note2: Int, note3: Int): Boolean {
    return ((note1 + note2 + note3) / 3) >= 7
}

private fun problema1() {
    val salary = askForFloat("Introduce el sueldo: ")

    if (hasToPayTaxes(salary)) {
        println("Tiene que pagar impuestos")
    }

}

private fun problema2() {
    val num1 = askForInt("Introduce un numero: ")
    val num2 = askForInt("Introduce otro numero: ")

    println("El mayor es ${getBigOf2(num1, num2)}")

}

private fun problema3() {
    val num1 = askForInt("Introduce un numero: ")
    val num2 = askForInt("Introduce otro numero: ")


    if (num1 > num2) {
        println("La suma es: ${num1 + num2}")
        println("La resta es: ${num1 - num2}")
    } else {
        println("La multiplicacion es: ${num1 * num2}")
        println("La division es: ${num1 / num2}")
    }
}

private fun hasToPayTaxes(salary: Float): Boolean {
    return salary > MIN_FOR_TAXES
}


private fun getBigOf2(num1: Int, num2: Int): Int {
    if (num1 > num2) {
        return num1
    }

    return num2
}
