public class Potencia {
    public static int pow(int base, int exponent) {
        int result = 1;

        for (int i = 0; i < exponent; i++) {
            result *= base;
        }

        return result;
    }

    public static int powR(int base, int exponent) {
        int result = 1;

        if (exponent != 0) {
            result = powR(base, exponent - 1) * base;

        }

        return result;

    }
}
