public class Main {
   static long   t1;
    static long t2;

    public static void main(String[] args) {
        int nElementos = 10000000;
        double[] vector = new double[nElementos];

        for (int i = 0; i < nElementos; i++) {
            vector[i] = i;
        }

        int numHebras = 4;

        hebraReducida(numHebras, vector);

        hebraNoReducida(numHebras,vector);


        System.out.println();
    }

    private static void hebraReducida(int numHebras, double[] vector) {
        Acumula a = new Acumula();

        MiHebra v[] = new MiHebra[numHebras];

        t1 = System.nanoTime();

        for (int i = 0; i < numHebras; i++) {
            v[i] = new MiHebra(i, numHebras, vector,a);
            v[i].start();
        }

        for (int i = 0; i < numHebras; i++ ) {
            try {
                v[ i ].join();
            } catch ( InterruptedException ex ) {
                ex.printStackTrace();
            }
        }

        t2 = System.nanoTime();
        double tt = ( ( double ) ( t2 -t1 ) ) / 1.0e9;
        System.out.println("La suma de la hebra reducida es: " + a.dameResultado());
        System.out.println ( "Tiempo Transcurrido en segs.:" + tt );
    }

    private static void hebraNoReducida(int numHebras, double[] vector) {
        Acumula a = new Acumula();

        MiHebraMal v[] = new MiHebraMal[numHebras];

        t1 = System.nanoTime();

        for (int i = 0; i < numHebras; i++) {
            v[i] = new MiHebraMal(i, numHebras, vector,a);
            v[i].start();
        }

        for (int i = 0; i < numHebras; i++ ) {
            try {
                v[ i ].join();
            } catch ( InterruptedException ex ) {
                ex.printStackTrace();
            }
        }

        t2 = System.nanoTime();
        double tt = ( ( double ) ( t2 -t1 ) ) / 1.0e9;
        System.out.println("La suma de la hebra no reducida es: " + a.dameResultado());
        System.out.println ( "Tiempo Transcurrido en segs.:" + tt );
    }
}

class MiHebra extends Thread {
    int miId, numHebras;
    double vector[];
    Acumula a;

    public MiHebra(int miId, int numHebras, double vector[], Acumula a) {
        this.miId = miId;
        this.numHebras = numHebras;
        this.vector = vector;
        this.a = a;
    }

    public void run() {
        double acumulaLocal = 0;

        for (int i = miId; i < vector.length; i += numHebras) {
            acumulaLocal += vector[i];
        }

        a.acumulaValor(acumulaLocal);

    }

}

class Acumula {
    double suma = 0.0;

    synchronized void acumulaValor(double valor) {
        this.suma += valor;
    }

    synchronized double dameResultado() {
        return this.suma;
    }
}

class MiHebraMal extends Thread {
    int miId, numHebras;
    double vector[];
    Acumula a;

    public MiHebraMal(int miId, int numHebras, double vector[], Acumula a) {
        this.miId = miId;
        this.numHebras = numHebras;
        this.vector = vector;
        this.a = a;
    }

    public void run() {

        for (int i = miId; i < vector.length; i += numHebras) {
            a.acumulaValor(vector[i]);

        }


    }
}