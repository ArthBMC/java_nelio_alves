package section14.exceptionsTreatment.application;

import section14.exceptionsTreatment.model.entities.Reservation;
import section14.exceptionsTreatment.model.exceptions.DomainException;

import javax.print.attribute.standard.RequestingUserName;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in).useLocale(Locale.US);

        SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
        try {
            System.out.println("Room number: ");
            int number = in.nextInt();
            System.out.print("Check-in date (dd/MM/yyyy): ");
            Date checkIn = sdf1.parse(in.next());
            System.out.print("Check-in date (dd/MM/yyyy): ");
            Date checkOut = sdf1.parse(in.next());


            Reservation reservation = new Reservation(number, checkIn, checkOut);
            System.out.println("Reservation: " + reservation);

            System.out.println();
            System.out.println("Enter date to update the reservation: ");
            System.out.print("Check-in date (dd/MM/yyyy): ");
            checkIn = sdf1.parse(in.next());
            System.out.print("Check-in date (dd/MM/yyyy): ");
            checkOut = sdf1.parse(in.next());

            reservation.updateDates(checkIn, checkOut);
            System.out.println("Reservation: " + reservation);
        }
        catch (ParseException e) {
            System.out.println("Invalid date format");
        }
        catch (DomainException e){
            System.out.println("Error in reservation: "+ e.getMessage());
        }
        catch (RuntimeException e){
            System.out.println("Unexpected error");
        }

        in.close();
    }
}
