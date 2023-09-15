import java.lang.Exception

fun main(args: Array<String>) {
    val list = ArrayList<String>(listOf("A", "B", "C", "D", "E"))


    println(getElementAt(list,2))
}


fun getMidElement(list: ArrayList<String>): String {

    val listSize = list.size

    if (listSize == 0) throw Exception("The list is empty");
    if (listSize % 2 == 0) throw Exception("The list has no mid value");

    var midIndex = listSize / 2;
    return list.get(midIndex);
}


fun getElementAt(list: ArrayList<String>, index: Int): String {

    val listSize = list.size

    if (listSize == 0) throw Exception("The list is empty");
    if (listSize % 2 == 0) throw Exception("The list has no mid value");

    var iterator = 0;
    for (element in list) {
        iterator++;

        if (iterator != index) continue;

        return element
    }

    return ""

}