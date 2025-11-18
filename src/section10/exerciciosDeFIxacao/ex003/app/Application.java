package section10.exerciciosDeFIxacao.ex003.app;

import section10.exerciciosDeFIxacao.ex003.entities.Person;
import section10.exerciciosDeFIxacao.ex003.util.Calculator;

import java.util.Locale;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in).useLocale(Locale.US);
        Calculator calc = new Calculator();

        System.out.print("How many people will be typed? ");
        int n = in.nextInt();
        Person[] person = new Person[n];
        Calculator.numberOfPeople(n);

        for (int i = 0; i < person.length; i++){
            System.out.printf("Person %d Data: \n", i+1);
            System.out.print("Name: ");
            in.nextLine();
            String name = in.nextLine();
            System.out.print("Age: ");
            int age = in.nextInt();
            System.out.print("Height: ");
            double height = in.nextDouble();
            person[i] = new Person(name, age, height);

            Calculator.personSum(person[i]);

        }
        System.out.println(calc);
        Calculator.minorNames();


    }
}
