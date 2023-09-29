public class HebrasClases {
    public static void main(String[] args) {
        Clase1 c1 = new Clase1(0);
        Clase1 c2 = new Clase1(1);

        c1.start();
        c2.start();
    }
}

class Clase1 extends Thread{
    int id;
    public Clase1(int id){
        this.id = id;
    }

    @Override
    public void run() {
        String message = switch (id){
            case 0 -> "hola";
            case 1 -> "adios";
            default -> "";
        };

        for (int i = 0; i < 10000; i++) {
            System.out.println(message);
        }
    }
}
