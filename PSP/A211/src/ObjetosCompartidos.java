public class ObjetosCompartidos {
    public static void main(String[] args) {

        int nHebras = 4;

        Thread[] threads = new Thread[nHebras];

        Cuentaincrementos contador = new Cuentaincrementos();

        for (int i = 0; i < nHebras; i++) {

            Thread t1 = new Thread(new Hilo(contador,i));
            threads[i] = t1;
            t1.start();


        }

        for (Thread thread : threads) {
            try {

                thread.join();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

        System.out.println("Todas las hebras han acabado");
        System.out.println(contador.dameContador());
    }

    static class Hilo implements Runnable {
        private Cuentaincrementos contador;
        private int id;

        public Hilo(Cuentaincrementos contador, int id) {
            this.contador = contador;
            this.id = id;
        }

        public void run() {
            System.out.println("Empezando a contar id: " + id);
            for (int i = 0; i < 1000000; i++) {
                contador.incrementarContador();
            }
            System.out.println("Acabé id: " + id);

        }
    }

    static class Cuentaincrementos {

        long contador = 0;

        void incrementarContador() {
            contador++;
        }

        long dameContador() {
            return contador;
        }
    }


}
