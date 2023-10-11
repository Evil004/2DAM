public class HebraVector {
    public static void main(String[] args) {

        int nHebras = 5;

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

}

class Hilo implements Runnable {
    private int id;

    public Hilo(int id) {
        this.id = id;
    }

    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Hola, soy la hebra: " + id);
        }
    }
}