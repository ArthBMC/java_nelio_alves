package section16.fixationExercise.application;

import section16.fixationExercise.entities.Contract;
import section16.fixationExercise.entities.Installments;
import section16.fixationExercise.services.ContractService;
import section16.fixationExercise.services.PaypalService;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.println("Enter with the contract data: ");
        System.out.print("Number: ");
        int number = in.nextInt();
        in.nextLine();
        System.out.print("Date (dd/MM/yyyy): ");
        LocalDate date = LocalDate.parse(in.next(), fmt);
        System.out.print("Contract value: ");
        Double value = in.nextDouble();
        System.out.print("Enter with the number of installments: ");
        int installments = in.nextInt();
        Contract contract = new Contract(number, date, value);

        ContractService contractService = new ContractService(new PaypalService());

        contractService.processContract(contract, installments);

        System.out.println("INSTALLMENTS:");
        List<Installments> installmentsList = contract.getInstallmentsList();

        for (Installments l : installmentsList) {
            System.out.println(l);
        }


        in.close();
    }
}
