public class test {

    public static void main(String[] args) {
        Thread t1 = new Thread(new Hilo(0));
        Thread t2 = new Thread(new Hilo(1));

        t1.start();
        t1.start();

    }

    static class Hilo implements Runnable {
        private int mild;

        public Hilo(int id) {
            this.mild = id;
        }

        public void run() {
            if (mild==0){
                Math.sqrt(2);
                System.out.println("Pepe");
            } else if (mild==1) {
                try {
                    Thread.sleep(2000);
                    System.out.println("Juan");
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
