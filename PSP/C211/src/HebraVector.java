public class HebraVector {
    public static void main(String[] args) {

        int nHebras = 100;

        Thread[] threads = new Thread[nHebras];

        for (int i = 0; i < nHebras; i++) {

            Thread t1 = new Thread(new Hilo(i));
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

    }

    static class Hilo implements Runnable {

        int id;

        public Hilo(int id) {
            this.id = id;
        }

        @Override
        public void run() {
            if (id % 15 == 0) {
                System.out.println("Soy la hebra: " + id + " y soy divisible entre 3 y 5");
            }
        }
    }

}