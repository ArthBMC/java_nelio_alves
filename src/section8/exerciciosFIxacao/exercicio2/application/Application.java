package section8.exerciciosFIxacao.exercicio2.application;

import section8.exerciciosFIxacao.exercicio2.entities.Employee;

import java.util.Locale;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in).useLocale(Locale.US);
        Locale.setDefault(Locale.US);
        Employee employee1 = new Employee();

        System.out.print("Name: ");
        employee1.setName(in.nextLine());
        System.out.print("Gross Salary: ");
        employee1.setGrossSalary(in.nextDouble());
        System.out.print("Tax: ");
        employee1.setTax(in.nextDouble());

        System.out.print("\nEmployee: " + employee1);

        System.out.print("\n\nWhich percentage to increase salary? ");
        employee1.increaseSalary(in.nextDouble());


        System.out.println("\nUpdate data: " + employee1);
    }
}
