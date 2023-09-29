package Part2

import askForInt

fun main() {
    problema1()
    problema2()
}

private fun problema1() {
    val num = askForInt("Introduce un numero del 1 al 5")
    when (num) {
        1 -> print("uno")
        2 -> print("dos")
        3 -> print("tres")
        4 -> print("cuatro")
        5 -> print("cinco")
        else -> print("valor fuera de rango")
    }

}

private fun problema2(){
    val num = askForInt("Introduce un numero del 1 al 99999")

    when (num){
        in 1..9 -> print("Tiene 1 dígito")
        in 10..99 -> print("Tiene 2 dígitos")
        in 100..999 -> print("Tiene 3 dígitos")
        in 1000..9999 -> print("Tiene 4 dígitos")
        in 10000..99999 -> print("Tiene 5 dígitos")
        else -> print("No se encuentra comprendido en el rango indicado")
    }
}