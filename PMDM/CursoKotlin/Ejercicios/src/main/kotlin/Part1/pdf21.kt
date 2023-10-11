package Part1

import askForInt

fun main() {
    //ejercicio1()
    ejercicio2()
}

private fun ejercicio2(){
    val nums = 3
    val array1 = askForInts(nums)
    val array2 = askForInts(nums)
    val array3 = IntArray(nums)


    for (i in 0..<nums){
        array3[i] = array1[i] + array2[2]
    }

    for (i in 0..<nums){
        println("La suma de ${array1[i]} y ${array2[i]} es ${array3[i]}")
    }
}

private fun ejercicio1() {
    val numArray = askForInts(8)

    var sum = 0;
    var sumBigger36 = 0;
    var numBig50 = 0

    for (n in numArray) {
        sum += n

        if (n > 36){
            sumBigger36+=n
        }

        if (n>50){
            numBig50 ++
        }
    }

    println("La suma de todos es: $sum")
    println("La suma de los mayores a 36 es $sumBigger36")
    println("Hay $numBig50 mayores a 50")
}

private fun askForInts(nums:Int): IntArray {
    val numArray = IntArray(nums)


    for (i in numArray.indices) {
        numArray[i] = askForInt("introduce un num: ")

    }
    return numArray
}