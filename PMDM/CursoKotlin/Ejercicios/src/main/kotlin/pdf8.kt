fun main(args: Array<String>) {
    //problema 1: Va a ser el mismo que el problema 1 del pdf7
    problema2()
    ejercicio1()
    ejercicio2()
}

private fun ejercicio3(){

}

private fun ejercicio2(){
    val num1 = askForInt("Introduce un nuemero:")
    val num2 = askForInt("Introduce otro nuemero:")
    val num3 = askForInt("Introduce otro nuemero:")

    if (num1 == num2 && num2 == num3){
        println("Son todos iguales, su cubo es: ${num1*num2*num3}")
    }
}
private fun ejercicio1(){
    println("Introduce una fecha: ")
    val day = askForInt("dia: ")
    val month = askForInt("mes: ")
    val year = askForInt("year: ")

    if (day == 25 && month==12){
        println("Es navidad :D")
    }else{
        println("No es navidad D:")
    }
}
private fun problema2(){
    println("Introduce una fecha: ")
    val day = askForInt("dia: ")
    val month = askForInt("mes: ")
    val year = askForInt("year: ")

    isDateValid(day, month, year)

    if (month in 1..3){
        println("Es el primer trimestre")
        return
    }

    println("No es el primer trimestre")
}

private fun isDateValid(day: Int, month: Int, year: Int): Boolean {
    if (day !in 1..31){
        return false
    }

    if (month !in 1..12){
        return false
    }

    return true
}