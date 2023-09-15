public class Bloques {
    public static void main(String[] args) {
        int hebras = 4;
        int n = 15;
        int hebra = 2;

        repartoBloques(hebras, n, hebra);
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
}
