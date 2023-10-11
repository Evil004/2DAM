package Part1

fun main() {
    problema1()
    problema2()
}

private fun problema3(){

    val area1 = calculateArea(3,4);
    val area2 = calculateArea(1,7)

    if (area1 > area2){
        println("El primer rectangulo es mayor")
    } else{
        println("El segundo rectangulo es mayor")
    }
}

private fun calculateArea(side1: Int, side2:Int): Int {
    return side1*side2;
}

private fun problema2(){
    val side = 6
    println("El area del cuadrado con lado $side es: ${calculateArea(side)}");
}

private fun calculateArea(side: Int): Int {
    return side*side;
}

private fun problema1(){

    val n1 = 5
    val n2 = 8
    val n3 = 9

    println("La media de $n1, $n2 y $n3 = ${getAvgOf3(n1,n2,n3)}")

}

private fun getAvgOf3(n1:Int,n2:Int,n3:Int): Int{

    val sum = n1+n2+n3;

    val avg = sum/3;

    return avg
}

