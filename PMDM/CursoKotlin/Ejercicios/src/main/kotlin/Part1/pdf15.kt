package Part1

import askForString

fun main() {

}

private fun problema1(){
    val code = askForString("Introduce tu clave:");
    val code2 = askForString("Introduce otra vez tu clave:")

    printIfCodesAreEqual(code, code2)
}

private fun printIfCodesAreEqual(code: String, code2: String) {
    if (code != code2) {
        println("Las claves no coinciden")
        return
    }
    println("Las claves son iguales")
}


