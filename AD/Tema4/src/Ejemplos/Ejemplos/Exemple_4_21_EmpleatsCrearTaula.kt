package exemples.Ejemplos.Ejemplos

import java.sql.DriverManager

fun main(args: Array<String>) {
    val url = "jdbc:sqlite:Empleats.sqlite"
    val con = DriverManager.getConnection(url)
    val stCreate = con.createStatement()

    val sentSQL = "CREATE TABLE IF NOT EXISTS EMPLEAT(" +
            "num INTEGER CONSTRAINT cp_emp PRIMARY KEY, " +
            "nom TEXT, " +
            "depart INTEGER, " +
            "edat INTEGER, " +
            "sou REAL " +
            ")"


    stCreate.executeUpdate(sentSQL)

    val stInsert = con.createStatement()

    val insert = "insert into EMPLEAT (nom, depart, edat, sou) values ('Juan', 2, 19, 2000)"

    stInsert.executeUpdate(insert)
    stCreate.close();
    con.close()
}