package section16.problemSolutionWithoutInterface.application;

import section16.problemSolutionWithoutInterface.entities.CarRental;
import section16.problemSolutionWithoutInterface.entities.Vehicle;
import section16.problemSolutionWithoutInterface.model.services.BrazilTaxService;
import section16.problemSolutionWithoutInterface.model.services.RentalService;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in).useLocale(Locale.US);

        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

        System.out.println("Enter with the rent data: ");
        System.out.print("Vehicle model: ");
        String vehicleModel = in.nextLine();
        System.out.print("Start rental date (dd/MM/yyyy hh:mm): ");
        LocalDateTime start = LocalDateTime.parse((in.nextLine()), fmt);
        System.out.print("Finish rental date (dd/MM/yyyy hh:mm): ");
        LocalDateTime finish = LocalDateTime.parse((in.nextLine()), fmt);

        CarRental carRental = new CarRental(start, finish, new Vehicle(vehicleModel));

        System.out.print("Enter with the price per hour: ");
        double pricePerHour = in.nextDouble();
        System.out.print("Enter with the price per day: ");
        double pricePerDay = in.nextDouble();

        RentalService rentalService = new RentalService(pricePerHour, pricePerDay, new BrazilTaxService());

        rentalService.processInvoice(carRental);

        System.out.println("INVOICE:");
        System.out.println("Basic Payment: " + String.format("$%.2f",carRental.getInvoice().getBasicPayment()));
        System.out.println("Tax: " + String.format("$%.2f",carRental.getInvoice().getTax()));
        System.out.println("Total Payment: " + String.format("$%.2f",carRental.getInvoice().getTotalPayment()));



        in.close();
    }
}
