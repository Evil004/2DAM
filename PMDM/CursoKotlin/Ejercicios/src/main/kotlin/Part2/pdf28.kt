package Part2

class Empleado(var nombre: String, sueldo: Float){
    var sueldo: Float = 0.0f
        get() {
            return field;
        }
        set(value){
            if (value>0.0f){
                field = value;
            }
            else{
                field = 0.0f;
            }
        }

    init {
       this.sueldo = sueldo;
    }

    fun imprimir(){
        println("Nombre: $nombre, Sueldo: $sueldo");
    }

}

fun main() {
    var empleado = Empleado("Juan", 1000.0f);
    empleado.imprimir();

    var empleado2 = Empleado("Paco", -125f)
    empleado2.imprimir();
}