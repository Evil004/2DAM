package Part3

import Dado

class Dice() {
    var valor:Int = (1..6).random();

    fun roll() {
        valor = (1..6).random();
    }

    fun print() {
        println(valor)
    }
}


fun main() {
    val nums = HashMap<Int, Int>()

    val dices = Array<Dice>(5) { Dice() }

    dices.forEach {dice ->
        dice.print()
        nums[dice.valor] = nums.getOrDefault(dice.valor, 0) + 1
    }

    for (i in 1..6) {
        println("$i -> ${nums.getOrDefault(i, 0)}")
    }


}