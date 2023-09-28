class Hilo1 implements Runnable {
    public void run(){
        for (int i=0; i<10; i++) {
            System.out.println("Tarea 1");
        }
    }
}

class Hilo2 implements Runnable {
    public void run(){
        for (int i=0; i<10; i++) {
            System.out.println("Tarea 2");
        }
    }
}
public class EjemploCreacion1a {
    public static void main(String[] args) {
        Thread t1 = new Thread( new Hilo1());
        Thread t2 = new Thread( new Hilo2());

        t1.start();
        t2.start();
    }
}

