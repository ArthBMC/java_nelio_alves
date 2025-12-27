package section13.exercicioFixacao.application;

import section13.exercicioFixacao.entities.Contribuinte;
import section13.exercicioFixacao.entities.PessoaFisica;
import section13.exercicioFixacao.entities.PessoaJuridica;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class program {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("Enter the number of tax payers: ");
        int n = in.nextInt();
        in.nextLine();

        List<Contribuinte> list = new ArrayList<>();

        for (int i = 0; i<n; i++) {
            System.out.println("Tax payer #" + (i + 1) + " data: ");
            System.out.print("Individual or company (i/c)? ");
            char iorc = in.next().charAt(0);
            in.nextLine();
            System.out.print("Name: ");
            String name = in.nextLine();
            System.out.print("Annual income: ");
            Double anIncome = in.nextDouble();
            if (iorc == 'i') {
                System.out.print("Health expenditures: ");
                Double health = in.nextDouble();
                PessoaFisica pf = new PessoaFisica(name, anIncome, health);
                list.add(pf);
            }else {
                System.out.print("Number of employees: ");
                int numberEmployees = in.nextInt();
                PessoaJuridica pj = new PessoaJuridica(name, anIncome, numberEmployees);
                list.add(pj);
            }
        }

        System.out.println("\nTAXES PAID:");
        Double sum = 0.0;
        for (Contribuinte c: list){
            System.out.printf("%s: $ %.2f%n", c.getName(), c.calculateTax());
            sum += c.calculateTax();
        }

        System.out.printf("\nTOTAL TAXES: $ %.2f", sum);

    }
}
