import javax.swing.*
import java.awt.*
import java.io.File
import java.io.FileReader
import java.io.FileWriter

class Exercici_2_2_Pantalla : JFrame() {
    val et_f = JLabel("Fitxer:")
    val fitxer = JTextField(25)
    val obrir = JButton("Obrir")
    val guardar = JButton("Guardar")
    val et_a = JLabel("Contingut:")
    val area = JTextArea(10, 50)
    val scrollPane = JScrollPane(area)

    // en iniciar posem un contenidor per als elements anteriors
    init {
        defaultCloseOperation = JFrame.EXIT_ON_CLOSE

        isResizable = false
        setLayout(GridLayout(2, 1))
        setTitle("Editor de text")

        val panell1 = JPanel(GridLayout(0, 1))
        val panell1_1 = JPanel(FlowLayout())
        panell1.add(panell1_1)
        panell1_1.add(et_f)
        panell1_1.add(fitxer)

        val panell1_2 = JPanel(FlowLayout())
        panell1.add(panell1_2)
        panell1_2.add(obrir)
        panell1_2.add(guardar)
        val panell2 = JPanel(GridLayout(0, 1))
        panell2.add(scrollPane)
        area.setEditable(true)

        add(panell1)
        add(panell2)
        pack()

        obrir.addActionListener {
            area.text = ""
            val file = File(fitxer.getText())
            if (!checkFile(file)) {
                JOptionPane.showMessageDialog(null, "El archivo no existe o no se puede leer")
                return@addActionListener
            }
            val fileReader = FileReader(file)

            var lect = fileReader.read()

            while (lect != -1) {
                area.append(lect.toChar().toString())

                lect = fileReader.read()
            }

            fileReader.close()
        }

        guardar.addActionListener {
            val file = File(fitxer.getText())
            if (!checkFile(file)) {
                JOptionPane.showMessageDialog(null, "El archivo no existe o no se puede leer")
                return@addActionListener
            }
            val fileWritter = FileWriter(file)

            fileWritter.write(area.getText().toCharArray())


            fileWritter.close()

        }
    }

}

private fun checkFile(file: File): Boolean {
    if (!file.exists()) {
        return false;
    }

    if (!file.isFile()) {
        return false;
    }

    if (!file.canRead()) {
        return false;
    }

    return true;

}


private fun crearMostrarFinestra() {

    val frame = Exercici_2_2_Pantalla()
    frame.isVisible = true
}

fun main(args: Array<String>) {
    EventQueue.invokeLater(::crearMostrarFinestra)
}