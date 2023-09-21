public class Bloques2 {

    public static void main(String[] args) {
        int hebras = 4;
        int n = 17;
        int hebra = 0;
        repartoBloques2(hebras, n, hebra);
        System.out.println();
        repartoBloques2(hebras, n, 1);
        System.out.println();

        repartoBloques2(hebras, n, 2);
        System.out.println();

        repartoBloques2(hebras, n, 3);

    }


    private static void repartoBloques2(int hebras, int n, int hebra){
        int Tam = (n+hebras-1)/hebras;
        int ini =  hebra * Tam;
        int fin = Math.min(n,(hebra+1)*Tam);
        for ( int i = ini ; i < fin; i++){
            System.out.println(i);

        }

    }
}
