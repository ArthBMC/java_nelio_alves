package section10.listas;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Demo {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();

        list.add("Maria"); //adicionar elementos
        list.add("Alex");
        list.add("Bob");
        list.add("Ana");
        list.add(2, "Marco"); //adicionar elementos em posições específicas

        for (String x : list){
            System.out.println(x);
        }

        System.out.println(list.size()); //mostra o tamanho da lista, igual length
        System.out.println("-------------------------");

        list.remove("Ana"); //remove elemento por valor
        list.remove(1); //remove elemento por indice
        list.removeIf(x -> x.charAt(0) == 'A'); //remove por predicado (lambda)
        for (String x : list){
            System.out.println(x);
        }

        System.out.println("---------------------");

        System.out.println("Index of Bob: " + list.indexOf("Bob"));

        List<String> result = list.stream().filter(x -> x.charAt(0) == 'M').collect(Collectors.toList());

        for (String x : result){
            System.out.println(x);
        }


        System.out.println("---------------------");

        String name = list.stream().filter(x -> x.charAt(0) == 'M').findFirst().orElse(null);
        System.out.println(name);


    }
}
