package exemples.Ejemplos.PeticionesBasicas

import java.sql.DriverManager

fun main(args: Array<String>) {
    val url = "jdbc:postgresql://89.36.214.106:5432/geo_ad"
    val usuari = "geo_ad"
    val password = "geo_ad"

    val con = DriverManager.getConnection(url, usuari, password)

    val st = con.createStatement()
    val rs = st.executeQuery("SELECT * FROM institut")
    while (rs.next()) {
        print("" + rs.getInt(1) + "\t")
        print(rs.getString(2)+ "\t")
        print(rs.getString(3)+ "\t")
        println(rs.getInt(5).toString()+ "\t")

    }
    st.close()
    con.close()
}