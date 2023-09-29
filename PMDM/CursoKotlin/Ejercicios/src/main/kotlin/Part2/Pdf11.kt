import askForInt

private const val EJ1_MIN_NUM = 1
private const val EJ1_MAX_NUM = 100

fun main() {
    problema1()
    problema2()
    problema3()
    problema4()
    ejercicio1()
}

private const val TRIANGLES_TO_ASK = 5;
private const val MIN_AREA = 12.0f;
private fun ejercicio1() {
    var trianglesOverArea = 0;

    for (i in 0..<TRIANGLES_TO_ASK) {

        val base = askForFloat("Introduce la base del triangulo: ")
        val height = askForFloat("Introduce la altura del triangulo: ")

        val triangle = Triangle(base, height)

        val area = triangle.getArea()
        val perimeter = triangle.getPerimeter()
        println("El triangulo de base $base y altura $height tiene un area de $area y un perimetro de $perimeter")

        if (area > MIN_AREA){
            trianglesOverArea++;
        }
    }

    println("Hay $trianglesOverArea triangulos con un area mayor a $MIN_AREA")
}



private fun problema4() {
    var mult3 = 0;
    var mult5 = 0;
    var mult9 = 0;

    for (i in 1..10000) {
        if (i % 3 == 0) {
            mult3 += 1
        }
        if (i % 5 == 0) {
            mult5 += 1
        }
        if (i % 9 == 0) {
            mult9 += 1
        }
    }

    println("Hay $mult3 multiples de 3.")
    println("Hay $mult5 multiples de 5.")
    println("Hay $mult9 multiples de 9.")
}

private const val P3_ASK_MARKS = 10

private const val MIN_MARK = 7

private fun problema3() {

    var marksOverOrEqual = 0;
    var marksBellow = 0;

    for (i in 0..<P3_ASK_MARKS) {
        val num = askForInt("Introduce una nota: ")
        if (num >= MIN_MARK) {
            marksOverOrEqual += 1;
        } else {
            marksBellow += 1;
        }
    }

    println("Hay $marksOverOrEqual notas mayores o iguales a $MIN_MARK y $marksBellow notas menores a $MIN_MARK")
}

private fun problema1() {
    for (i in EJ1_MIN_NUM..EJ1_MAX_NUM) {
        println("$i")
    }
}

private const val EJ2_NUMS_TO_ASK = P3_ASK_MARKS

private fun problema2() {
    var sum = 0;
    for (i in 0..<EJ2_NUMS_TO_ASK) {

        val num = askForInt("Introduce un numero: ")

        sum += num
    }

    val media = sum / EJ2_NUMS_TO_ASK

    println("La media de los numero es: $media")

}