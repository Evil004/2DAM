public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

    static class EjemploAlmacenSimple{
        int dato = 0;

        synchronized void fijaDato (int dato){
            this.dato = dato;
        }

        synchronized int dameDato(){
            return this.dato;
        }
    }

    static class  EjemploSincro{
        int numServicios;

        void incrementaNumServicios(){
            numServicios++;
        }

        int dameNumServicios(){
            return numServicios;
        }
    }
}