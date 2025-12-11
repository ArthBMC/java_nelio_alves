package section13.polimorfism.solvedExercise.application;

import section13.override.entities.Account;
import section13.polimorfism.solvedExercise.entities.Employee;
import section13.polimorfism.solvedExercise.entities.OutSourcedEmployee;

import java.util.Locale;
import java.util.Scanner;

public class program {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("Enter the number of employees: ");
        int n = in.nextInt();
        in.nextLine();

        Employee employeeMaster = new Employee();

        for (int i = 0; i < n; i++){
            System.out.println("Employee #"+ (i+1)+" data:");
            System.out.print("Outsourced (y/n)? ");
            char outsourced = in.next().charAt(0);
            in.nextLine();
            System.out.print("Name: ");
            String name = in.nextLine();
            System.out.print("Hours: ");
            int hours = in.nextInt();
            in.nextLine();
            System.out.print("Value per hour: ");
            double valuePH = in.nextDouble();
            if (outsourced == 'y') {
                System.out.print("Additional charge: ");
                double additionalCharge = in.nextDouble();
                Employee employee = new OutSourcedEmployee(name, hours, valuePH, additionalCharge);
                employeeMaster.addEmployee(employee);
            }else {
                Employee employee = new Employee(name, hours, valuePH);
                employeeMaster.addEmployee(employee);
            }
        }

        System.out.println(employeeMaster.toString());


    }
}
