package Java_04;

public class CurrencyConverter {
    private static double rate;
    public static double toDollar(double won) {
        return won/rate;
    }
    public static double toKWR(double dollar) {
        return dollar*rate;
    }
}


