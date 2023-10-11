public class CreacionHebras {
    public static void main(String[] args) {
        Thread t1 = new Thread(new Thread1(0));
        Thread t2 = new Thread2(1);

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    static class Thread1 implements Runnable {
        private int id;

        public Thread1(int id) {
            this.id = id;
        }

        public void run() {
            for (int i = 0; i < 1000; i++) {
                System.out.println("Hola, soy la hebra: " + id);
            }
        }
    }

    static class Thread2 extends Thread {
        private final int id;

        public Thread2(int id) {
            this.id = id;
        }

        public void run() {
            for (int i = 0; i < 10000; i++) {
                System.out.println("Hola, soy la hebra: " + id);
            }
        }
    }
}

