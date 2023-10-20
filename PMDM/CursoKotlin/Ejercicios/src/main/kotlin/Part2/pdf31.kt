package Part2


object Mayor {
    fun maximo(a: Int, b: Int): Int {
        if (a > b) {
            return a
        } else {
            return b
        }

    }

    fun maximo(a: Float, b: Float): Float {
        if (a > b) {
            return a
        } else {
            return b
        }

    }

    fun maximo(a: Double, b: Double): Double {
        if (a > b) {
            return a
        } else {
            return b
        }

    }
}

fun main() {
    println(Mayor.maximo(2, 4))
    println(Mayor.maximo(5.0f, 6.1f))
    println(Mayor.maximo(1.8, 6.1))
}