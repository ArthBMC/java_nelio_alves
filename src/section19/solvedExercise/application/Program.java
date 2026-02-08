package section19.solvedExercise.application;


import section19.solvedExercise.entities.Product;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class Program {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in).useLocale(Locale.US);
        System.out.print("Enter the path: ");
        File path = new File (in.nextLine());

        try(BufferedReader br = new BufferedReader(new FileReader(path))){

            List<Product> list = new ArrayList<>();

            String line = br.readLine();
            while (line != null){
                String[] fields = line.split(",");
                list.add(new Product(fields[0], Double.parseDouble(fields[1])));
                line = br.readLine();
            }

            double avg = list.stream()
                    .map(Product::getPrice)
                    .reduce(0.0, (x, y) -> x + y / list.size());

            System.out.println("Average: "+ String.format("$%.2f", avg));

            Comparator<String> comp = (s1, s2) -> s1.toUpperCase().compareTo(s2.toUpperCase());

            list.stream().filter(x -> x.getPrice() < avg)
                    .sorted(Comparator.comparing(Product::getPrice).reversed())
                    .forEach(System.out::println);

            List<String> names = list.stream().filter(x -> x.getPrice() < avg)
                    .map(Product::getName)
                    .sorted(comp.reversed())
                    .toList();

            names.forEach(System.out::println);
        }catch (IOException e){
            System.out.println("Error: " + e.getMessage());
        }

    }
}
