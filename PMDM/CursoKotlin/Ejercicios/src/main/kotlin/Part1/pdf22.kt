package Part1

import askForInt

fun main() {
    problema1()
}

private fun problema1(){
    val nElements = askForInt("Cuantos elementos quieres en el array?")

    val array = createArray(nElements)

    println("La suma de todos es ${sumAllElements(array)}")
}

fun sumAllElements(array:IntArray): Int {
    var sum =0;
    for (n in array){
        sum += n;
    }

    return sum
}

fun createArray(nElem: Int): IntArray {

    val array = IntArray(nElem)

    for (i in 0..<nElem){
        array[i] = askForInt("Introduce un num: ")
    }

    return array

}
