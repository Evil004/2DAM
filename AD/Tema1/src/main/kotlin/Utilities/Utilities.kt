package Utilities

fun clear(){
    for (i in 1..50){
        println()

    }
}

fun pause(){
    println("Pulsa enter para continuar...")

    readln()
}

fun pauseAndClear() {
    pause()
    clear()
}