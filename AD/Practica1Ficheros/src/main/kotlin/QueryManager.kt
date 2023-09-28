import java.io.File
import java.io.FileNotFoundException
import java.io.IOException
import java.io.RandomAccessFile


class QueryManager {
    lateinit var stream: RandomAccessFile;

    init {
        createFile("discosDAML.dat")
    }

    fun createFile(fileName:String){
        try {
            val exists = File(fileName).exists()
            stream = RandomAccessFile(fileName, "rw")
            if (!exists) {
                createDefaultDisks()
            }
        } catch (e: FileNotFoundException) {
            println("Error al abrir el fichero: $fileName")
            System.exit(0)
        }



    }
    fun createDefaultDisks() {
        var disk1 =  Disk(1, "Que voy a hacer", "Los Planetas", 20.0, 5);
        disk1.writeFile(stream);
        var disk2 = Disk(2, "La voz del presidente", "Viva Suecia", 35.0, 1);
        disk2.writeFile(stream);
        var disk3 = Disk(3, "La revolución sexual", "La casa azul", 20.0, 10);
        disk3.writeFile(stream);
        var disk4 = Disk(4, "Finisterre", "Vetusta Morla", 40.0, 5);
        disk4.writeFile(stream);
        var disk5 = Disk(5, "Paradise","Coldplay", 35.0, 2);
        disk5.writeFile(stream);
    }

    fun closeFile() {
        try {
            stream.close()
        } catch (e: IOException) {
            println("No se ha podido cerrar el fichero")
        }
    }

    private fun findByCode(code: Int): Long {
        val disk = Disk()
        //IMPLEMENTAR
        return 0;
    }

    private fun seekOnFile(posicion: Long) {
        try {
            stream.seek(posicion)
        } catch (e: IOException) {
            println("Error posicionando el puntero al inicio del fichero")
            System.exit(0)
        }
    }

    fun getArrayOfAuthors(): Array<String> {
        val Disco = Disk()
        //IMPLEMENTAR
        return arrayOf();
    }


    private fun hashArray(autores: HashSet<String>): Array<String?> {
        val list = arrayOfNulls<String>(autores.size)
        var i = 0
        for (`val` in autores) list[i++] = `val`
        return list
    }

    fun findByAuthor(author: String?): Array<String> {
        val disk = Disk()
        //IMPLEMENTAR
        return arrayOf()
    }

    fun increaseStockToDisk(code: Int): String {
        val position: Long = findByCode(code)
        //IMPLEMENTAR
        return ""
    }

    fun decreaseStockToDisk(disk: Int): String {
        val position: Long = findByCode(disk)
        //IMPLEMENTAR
        return ""
    }

}