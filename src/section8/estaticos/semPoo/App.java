package section8.estaticos.semPoo;

import java.util.Locale;
import java.util.Scanner;

public class app {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner in = new Scanner(System.in).useLocale(Locale.US);
    }
}
