public class Bloques {
    public static void main(String[] args) {
        int hebras = 5;
        int n = 24;
        int hebra = 4;
        repartoBloques2(hebras, n, 0);
        repartoBloques2(hebras, n, 1);
        repartoBloques2(hebras, n, 2);

        repartoBloques2(hebras, n, 3);
        repartoBloques2(hebras, n, 4);

    }

    private static void repartoBloques(int hebras, int n, int hebra) {
        int tareasHebra = n / hebras + 1;
        System.out.printf("%-20s|\n", "Hebra " + hebra);


        for (int i = hebra * tareasHebra; i < tareasHebra + hebra * tareasHebra; i++) {
            if (i >= n) {
                break;
            }
            System.out.printf("%-20s|\n", i);
        }
    }

    private static void repartoBloques2(int hebras, int n, int hebra){

        int hebras = 5;
        int n = 24;
        int hebra = 4;

        int Tam = (n+hebras-1)/hebras;
        int ini =  hebra * Tam;
        int fin = Math.min(n,(hebra+1)*Tam);
        for ( int i = ini ; i < fin; i++){
            System.out.printf("%-20s|\n", i);

        }

    }
}
