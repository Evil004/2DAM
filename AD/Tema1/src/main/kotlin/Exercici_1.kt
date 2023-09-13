import java.io.File

var actualDir: File = File.listRoots()[0]
fun main(args: Array<String>) {
    var elementsInPath = actualDir.list()
    printUI(elementsInPath)

}


fun printUI(elementsInPath: Array<String>){
    println(actualDir)
    println("-------------------------")
    println("0.    ../")

    elementsInPath.forEach { file -> println(file) }
}