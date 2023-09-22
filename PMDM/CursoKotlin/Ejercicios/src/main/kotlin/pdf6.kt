fun main(args: Array<String>) {
    problema1()
    ejercicio2()

    ejercicio1()
}

private fun ejercicio1() {
    val num = askForInt("Introduce un numero: ")

    val digits = num.toString().length

    println("El numero: $num tiene $digits digitos")
}

private fun problema1() {
    val num1 = askForInt("Introduce un numero: ")
    val num2 = askForInt("Introduce otro numero: ")
    val bigger = if (num1 > num2) num1 else num2

    println("El numero mas grande es: $bigger")

}

private fun ejercicio2() {
    val numero = askForInt("Introduce un numero: ")

    val result = if (numero % 2 == 0) {
        println("Cuadrado.")
        numero * numero
    } else {
        println("Cubo.")

        numero * numero * numero
    }

    println("El resultado es: $result")
}