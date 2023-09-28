package Part2

import askForInt
import askForInts

fun main(args: Array<String>) {
    problema1()
    problema2()
}

fun problema3(){
    val nums = askForInts(10)
    println("La media es: ${getAverage(nums)}")
}

fun getAverage(nums: ArrayList<Int>): Int {
    val avg = 0;
    for (num in nums)
}

fun problema2(){
    val num = askForInt("Introduce un numero: ")

    printFromToNum(1, num)

}

fun problema1(){
    printFromToNum(1,100)
}

fun printFromToNum(start: Int, end: Int){
    for (i in start..end){
        println(i)
    }
}