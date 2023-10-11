package Part1

fun main() {
    printMultiplyTable(num=6)
    printMultiplyTable(num=9, terms =15)

}

fun printMultiplyTable(num:Int, terms:Int=10){

    for (i in 0..terms){
        println("$num * $i = ${num*i}")
    }

}