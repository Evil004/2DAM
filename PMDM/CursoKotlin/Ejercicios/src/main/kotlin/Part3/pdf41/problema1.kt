package Part3.pdf41

class Vector {
    val array = Array<Int>(5) { 1 }
    operator fun plus(vector2: Vector): Vector {
        var suma = Vector()
        for (i in array.indices)
            suma.array[i] = array[i] + vector2.array[i]
        return suma
    }
}

fun main() {

    val vector1 = Vector()
    val vector2 = Vector()

    vector1.array[0] = 7

    val vector3 = vector1 + vector2;

    for (i in vector3.array.indices) {
        println(vector3.array[i])
    }

}