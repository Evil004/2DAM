package Part2

import askForFloat
import askForInt
import askForInts

fun main(args: Array<String>) {
    problema1()
    problema2()
    problema3()
    problema4()
}

private fun problema4(){
    val nPiezas = askForInt("Cuantas piezas se procesaran: ")

    var nPiezasAptas = 0;

    var i = 0;
    while (i < nPiezas){
        i++
        val long = askForFloat("Inroduce la longitud de la pieza: ")

        if (!esApta(long)){
            continue
        }
        nPiezasAptas +=1

    }

    println("Hay $nPiezasAptas piezas aptas")
}

private const val MIN_LONG = 1.2

private const val MAX_LONG = 1.3

private fun esApta(long: Float) = long in MIN_LONG..MAX_LONG

private fun problema3(){
    val nums = askForInts(10)
    println("La media es: ${getAverage(nums)}")
}

fun getAverage(nums: ArrayList<Int>): Int {
    var avg = 0;
    var sum = 0;

    var i = 0;
    while (i < nums.size){
        val num = nums[i]
        sum += num
        i++
    }

    avg = sum / nums.size
    return avg
}

private fun problema2(){
    val num = askForInt("Introduce un numero: ")

    printFromToNum(1, num)

}

private fun problema1(){
    printFromToNum(1,100)
}

fun printFromToNum(start: Int, end: Int){
    var i = start;
    while (i <=end){
        println(i)
        i++
    }
}