public class Main {
    public static void main(String[] args) {

        System.out.println(Potencia.pow(2,3));

        System.out.println(Potencia.pow(2,0));

        System.out.println(Potencia.pow(-2,3));

        System.out.println(Potencia.powR(2,3));

        System.out.println(Potencia.powR(2,0));

        System.out.println(Potencia.powR(-2,3));


        int base = 2;
        int exponente = 10;
        long t1;
        long t2;
        double tt;


        // Tiempo ejecución iterativa
        t1 = System.nanoTime();
        double resultadoIterativo;
        resultadoIterativo = Potencia.pow(base, exponente);
        t2 = System.nanoTime();
        tt =  ((double) (t2 - t1)) / 1.0e9;

        System.out.println("Potencia Iterativa: " + resultadoIterativo);
        System.out.println("Tiempo de ejecución de la potencia iterativa (seg.):\t\t\t " + tt);

        // Tiempo ejecución recursiva
        t1 = System.nanoTime();
        double resultadoRecursivo = Potencia.powR(base, exponente);
        t2 = System.nanoTime();
        tt =  ((double) (t2 - t1)) / 1.0e9;

        System.out.println("Potencia Recursiva: " + resultadoRecursivo);
        System.out.println("Tiempo de ejecución de la potencia recursiva (seg.): \t\t\t" + tt);
    }
}