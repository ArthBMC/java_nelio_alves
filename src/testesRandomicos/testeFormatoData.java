package testesRandomicos;

import java.text.NumberFormat;
import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

public class testeFormatoData {
    public static void main(String[] args) {

        Date data = new Date();
        Double valor = 1111.2;

        System.out.println("--- ANTES de definir o Locale padrão ---");
        System.out.println("Locale padrão atual: " + Locale.getDefault());
        System.out.println("Valor (formato padrão): " + NumberFormat.getCurrencyInstance().format(valor));
        System.out.println("Data (formato padrão): " + DateFormat.getDateInstance(DateFormat.LONG).format(data));
        Locale.setDefault(Locale.US);
        System.out.println("Data (new format): " + DateFormat.getDateInstance(DateFormat.MEDIUM).format(data));

    }
}
