import java.io.File
import java.lang.Exception

class FitxerImatge(fEnt: File) {
    var f: File = File("")   // No modifiqueu aquesta línia. El seu valor s'ha de modificar en el constructor

    init {


        if (!fEnt.name.contains(".bmp")) {
            throw Exception("No es un archivo .bmp")
        }

        f = fEnt

    }

    fun transformaNegatiu() {
        var bytes = f.readBytes();
        var outputFile = File(f.nameWithoutExtension.plus("_n.bmp"))

        for (i in 53..<bytes.size) {

            var byte: Byte = bytes.get(i)


            bytes.set(i, negateByte(byte))
        }

        outputFile.writeBytes(bytes)

    }

    fun negateByte(byte: Byte): Byte {
        return (255 - byte.toInt()).toByte();
    }

    fun transformaObscur() {
        var bytes = f.readBytes();
        var outputFile = File(f.nameWithoutExtension.plus("_o.bmp"))

        for (i in 54..<bytes.size) {
            var byte: Byte = bytes.get(i)
            bytes.set(i, obscureByte(byte))
        }

        outputFile.writeBytes(bytes)
    }

    fun obscureByte(byte: Byte): Byte {
        return (((byte+ Byte.MAX_VALUE) / 2)-Byte.MAX_VALUE).toByte();
    }

    fun transformaBlancNegre() {
        var bytes = f.readBytes();
        var outputFile = File(f.nameWithoutExtension.plus("_bn.bmp"))

        for (i in 54..<bytes.size step 3) {

            var red: Byte = bytes.get(i)
            var green: Byte = bytes.get(i + 1)
            var blue: Byte = bytes.get(i + 2)

            var byte = grayBytes(red, green, blue)



            bytes.set(i, obscureByte(byte))
            bytes.set(i + 1, obscureByte(byte))
            bytes.set(i + 2, obscureByte(byte))

        }

        outputFile.writeBytes(bytes)

    }

    fun grayBytes(r: Byte, g: Byte, b: Byte): Byte {


        return ((r.toInt() + g.toInt() + b.toInt()) / 3).toByte()
    }
}