package section17.introducingSet.firstClass;

import java.util.*;

public class Program {
    public static void main(String[] args) {

        Set<String> set1 = new HashSet<>(); //mais rapido, sem ordenação;
        Set<String> set2 = new LinkedHashSet<>(); // Intermediário, mantém a ordem de inserção
        Set<String> set3 = new TreeSet<>(); // mais lento, ordena por ordem alfabética/numérica

        String[] electronics = {"Tv", "Tablet", "Notebook"};

        Collections.addAll(set1, electronics);
        Collections.addAll(set2, electronics);
        Collections.addAll(set3, electronics);

        set1.remove(electronics[1]);

        for (String s: set1) {
            System.out.println(s);
        }

        System.out.println("---------------");

        set2.removeIf(x -> x.contains("T"));

        for (String s: set2) {
            System.out.println(s);
        }

        System.out.println("---------------");

        set3.removeIf(x -> x.charAt(0) == 'N');

        for (String s: set3) {
            System.out.println(s);
        }


    }
}
