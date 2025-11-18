package section10.exerciciosDeFIxacao.exPensionato.app;

import section10.exerciciosDeFIxacao.exPensionato.entities.StudentsData;

import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in).useLocale(Locale.US);

        System.out.println("How many rooms will be rented? ");
        int n = in.nextInt();
        StudentsData[] students = new StudentsData[10];


        for (int i = 0; i<n; i++){
            System.out.println("Rent #"+(i+1)+":");
            System.out.print("Name: ");
            in.nextLine();
            String name = in.nextLine();
            System.out.print("Email: ");
            String email = in.next();
            System.out.print("Room: ");
            int rentedRoom = in.nextInt();
            students[rentedRoom] = new StudentsData(name, email, rentedRoom);
        }

        System.out.println("Busy rooms: ");
        for (int i = 0; i<students.length; i++){
            if (students[i] != null){
                System.out.println(students[i].rentedRoom+": "+students[i].name+", "+students[i].email);
            }
        }


        in.close();
    }

}
