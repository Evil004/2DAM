package Part2

data class Articulo(val codigo: Int, val descripcion: String, var precio: Float)

fun mostrarArticulos(articulos: Array<Articulo>){
    articulos.forEach { articulo ->
        println("Código: ${articulo.codigo} - Descripción ${articulo.descripcion} Precio: ${articulo.precio}")
    }
}

fun aumentarPrecios(articulos: Array<Articulo>){
    articulos.forEach { articulo ->
        articulo.precio *= 1.1f
    }
}


fun main() {
    val articulos = arrayOf(
        Articulo(1, "papas", 7.5f),
        Articulo(2, "manzanas", 23.2f),
        Articulo(1, "naranjas", 12f),
        Articulo(1, "cebolla", 21f)
    );

    mostrarArticulos(articulos)
    aumentarPrecios(articulos)
    println()
    mostrarArticulos(articulos)
}
