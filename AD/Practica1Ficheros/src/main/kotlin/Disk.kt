import java.io.EOFException
import java.io.IOException
import java.io.RandomAccessFile
import java.io.Serializable
import java.util.Scanner


class Disk(
    private var code: Int = 0,
    private var title: String = "",
    private var author: String = "",
    private var price: Double = 0.0,
    private var stock: Int = 0
) : Serializable {

    private val serialVersionUID: Long = 1

    fun getCode(): Int {
        return code
    }

    fun setCode(code: Int) {
        this.code = code
    }

    fun getTitle(): String {
        return title
    }

    fun setTitle(title: String) {
        this.title = title
    }

    fun getAuthor(): String {
        return author
    }

    fun setAuthor(author: String) {
        this.author = author
    }

    fun getPrice(): Double {
        return price
    }

    fun setPrice(price: Double) {
        this.price = price
    }

    fun getStock(): Int {
        return stock
    }

    fun setStock(stock: Int) {
        this.stock = stock
    }

    override fun toString(): String {
        var cadena = ""
        cadena += "TITULO: " + this.title + ". CODIGO: " + this.code + "\n"
        cadena += """
             AUTOR: ${this.author}
             PRECIO: ${this.price}. CANTIDAD: ${this.stock}
             """.trimIndent()
        return cadena
    }

    fun readInput(keyboard: Scanner?) {

    }

    fun writeFile(stream: RandomAccessFile) {
        stream.writeInt(code)
        stream.writeUTF(title)
        stream.writeUTF(author)
        stream.writeDouble(price)
        stream.writeInt(stock)
    }

    @Throws(EOFException::class, IOException::class)
    fun readFile(stream: RandomAccessFile) {
        stream.seek(0)
        val code = stream.readInt()
        val title = stream.readUTF()
        val author = stream.readUTF()
        val price = stream.readDouble()
        val stock = stream.readInt()

        val disk = Disk(code, title, author, price, stock)

    }
}