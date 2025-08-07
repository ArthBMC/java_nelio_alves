package section8.exercicioFixaxao.util;

public class CurrencyConverter {

    public static final double IOF = 0.06;

    public static double convertDol (double dollars, double quantityDollars) {
        double result = dollars*quantityDollars;
        result += dollars*quantityDollars*IOF;
        return result;
    }

}
