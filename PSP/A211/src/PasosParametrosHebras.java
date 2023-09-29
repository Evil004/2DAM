public class PasosParametrosHebras {
    public static void main(String[] args){
        Thread t1 = new Thread(new Tarea1ParamInt(0));
        Thread t2 = new Thread(new Tarea1ParamInt(1));

        t1.start();
        t2.start();
    }
}

class Tarea1Param extends Thread{
    int idHebra;
    public Tarea1Param (int idHebra){
        this.idHebra = idHebra;
    }

    @Override
    public void run() {
        System.out.println("Soy la hebra " + idHebra);
    }
}

class Tarea1ParamInt implements Runnable{
    int idHebra;
    public Tarea1ParamInt (int idHebra){
        this.idHebra = idHebra;
    }

    @Override
    public void run() {
        System.out.println("Soy la hebra " + idHebra);
    }
}