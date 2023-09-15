import java.io.File
import java.lang.NumberFormatException
import java.util.*


var actualDir: File = File.listRoots()[0]

fun main (args: Array<String>) {
    mainLoop()
}

fun mainLoop() {
    var input: String;
    var flag = true;
    while (flag) {

        var fileList = actualDir.listFiles();

        printUI(fileList)

        input = readln();

        if (!isInt(input)) {
            println("No es un numero")
            pauseAndClear()

        } else if (input == "-1") {
            flag = false;

        } else if (input == "0") {
            val parentDir = actualDir.parentFile;
            if (parentDir == null) {
                println("No hay carpeta padre")
                pauseAndClear()
                continue
            }
            changeDirectory(parentDir);


        } else {

            val index = input.toInt();

            var isValidFile: Boolean = (index <= fileList.size && index > 0)

            if (!isValidFile) {
                println("El archivo seleccionado está fuera del rango")
                pauseAndClear()
                continue
            }

            changeDirectory(fileList[index - 1])
        }
    }

}


fun printUI(elementsInPath: Array<File>) {
    println(actualDir)
    println("-------------------------")
    println("0.%8s".format("../"))


    for (i in 0..<elementsInPath.size) {

        val file: File = elementsInPath[i];

        println(getDirLineVolunt(file, i))
    }

    println("\nIntroduce un numero (-1 para salir)")
}

fun getDirLineVolunt(file: File, i: Int): String {
    var fileString = "%-5s".format("${i + 1}.")

    fileString += when (file.isDirectory){
        true -> "d"
        false -> "-"
    }

    fileString += when (file.canRead()){
        true -> "r"
        false -> "-"
    }

    fileString += when (file.canWrite()){
        true -> "w"
        false -> "-"
    }

    fileString += when (file.canExecute()){
        true -> "x"
        false -> "-"
    }

    fileString += "%10s".format(file.length())

    fileString += "   ${Date(file.lastModified())}"

    fileString += "   ${file.name}"
    return fileString;
}

fun changeDirectory(directory: File) {

    if (!directory.isDirectory) return;

    if (!directory.canRead()) return;

    actualDir = directory;

}

fun isInt(s: String): Boolean {
    return try {
        s.toInt()
        true
    } catch (e: NumberFormatException) {
        false
    }
}
