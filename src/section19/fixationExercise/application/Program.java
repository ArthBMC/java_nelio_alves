package section19.fixationExercise.application;


import section19.fixationExercise.entities.Product;

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
                list.add(new Product(fields[0], fields[1], Double.parseDouble(fields[2])));
                line = br.readLine();
            }

            System.out.print("Enter salary: ");
            double salary = in.nextInt();
            in.nextLine();

            System.out.println("Email of people whose salary is more than " + String.format("$%.2f", salary) + ":");

            Comparator<String> comp = (s1, s2) -> s1.toUpperCase().compareTo(s2.toUpperCase());

            List<String> emails = list.stream().filter(x -> x.getSalary() > salary)
                    .map(Product::getEmail)
                    .sorted(comp)
                    .toList();
            emails.forEach(System.out::println);

            double sum = list.stream().filter(x -> x.getName().charAt(0) == 'M')
                    .map(Product::getSalary)
                    .reduce(0.0, (x, y) -> x + y);
            
            System.out.println("Sum of salary of people whose name starts with 'M': " + String.format("$%.2f", sum));

        }catch (IOException e){
            System.out.println("Error: " + e.getMessage());
        }

    }
}
