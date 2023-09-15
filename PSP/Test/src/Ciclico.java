public class Ciclico {

    public static void main(String[] args) {
        int hebras = 4;
        int n = 15;
        int hebra = 2;

        ciclico(hebras,n, hebra);
    }

    private static void ciclico(int hebras, int n, int hebra) {
        System.out.printf("%-20s|\n", "Hebra " + hebra);

        for (int i = 0; i < 21; i++) {
            System.out.print("-");
        }
        System.out.print("\n");


        for (int i = hebra; i < n; i += hebras) {

            System.out.printf("%-20s|\n", i);

        }
    }
}
