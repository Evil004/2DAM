import javax.swing.*
import java.awt.*
import java.io.File
import java.io.FileReader
import java.io.FileWriter

class Exercici_2_3 : JFrame() {
    val area = JTextArea()
    val scrollPane = JScrollPane(area)

    val menu_p = JMenuBar()

    val menu_arxiu = JMenu("Arxiu")
    val menu_ajuda = JMenu("Ajuda")

    val obrir = JMenuItem("Obrir")
    val guardar = JMenuItem("Guardar")
    val guardarCom = JMenuItem("Guardar com ...")
    val eixir = JMenuItem("Eixir")

    val quantA = JMenuItem("Quant a Editor")

    val fCh = JFileChooser()

    // en iniciar posem un contenidor per als elements anteriors
    init {
        defaultCloseOperation = JFrame.EXIT_ON_CLOSE

        setLayout(BorderLayout())
        setTitle("Editor de text més avançat")
        add(scrollPane)
        area.setEditable(true)
        isResizable = false

        setSize(750, 400)
        setJMenuBar(menu_p)

        menu_p.add(menu_arxiu)
        menu_p.add(menu_ajuda)

        menu_arxiu.add(obrir)
        menu_arxiu.add(guardar)
        menu_arxiu.add(guardarCom)
        menu_arxiu.add(JSeparator())
        menu_arxiu.add(eixir)

        menu_ajuda.add(quantA);

        obrir.addActionListener { obrir() }

        guardar.addActionListener { guardar() }

        guardarCom.addActionListener { guardarCom() }

        eixir.addActionListener { eixir() }

        quantA.addActionListener { quantA() }
    }

    fun obrir() {

        fCh.fileSelectionMode = JFileChooser.FILES_ONLY

        val result = fCh.showOpenDialog(null)

        if (result == JFileChooser.APPROVE_OPTION) {

            obrirArchiu(fCh.selectedFile)
        }


    }

    fun obrirArchiu(file: File) {

        if (!checkFile(file)) {
            JOptionPane.showMessageDialog(null, "El archivo no existe o no se puede leer")
            return
        }
        area.text = ""

        val fileReader = FileReader(file)

        var lect = fileReader.read()

        while (lect != -1) {
            area.append(lect.toChar().toString())

            lect = fileReader.read()
        }

        fileReader.close()
    }

    fun guardar() {

        guardarArchiu(fCh.selectedFile)

    }

    fun guardarArchiu(file: File) {
        if (!checkFile(file)) {
            JOptionPane.showMessageDialog(null, "El archivo no existe o no se puede leer")
            return
        }
        val fileWritter = FileWriter(file)

        fileWritter.write(area.getText().toCharArray())


        fileWritter.close()
    }

    fun guardarCom() {
        val result = fCh.showOpenDialog(null)
        if (result == JFileChooser.APPROVE_OPTION) {
            fCh.selectedFile.createNewFile()
            guardarArchiu(fCh.selectedFile)
        }
    }

    fun eixir() {
        // Instruccions per a eixir
        System.exit(0)
    }

    fun quantA() {
        JOptionPane.showMessageDialog(null, "Lector de archivos por Óscar :D")

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
}


fun main(args: Array<String>) {
    EventQueue.invokeLater({ Exercici_2_3().isVisible = true })
}