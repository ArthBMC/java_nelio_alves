package Section12.composicoes.exercicio1.application;

import Section12.composicoes.exercicio1.entities.Department;
import Section12.composicoes.exercicio1.entities.HourContract;
import Section12.composicoes.exercicio1.entities.Worker;
import Section12.composicoes.exercicio1.entitiesEnum.WorkerLevel;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in).useLocale(Locale.US);
        SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat sdf2 = new SimpleDateFormat("MM/yyyy");

        System.out.println("Enter department's name: ");
        Department department = new Department(in.nextLine());

        System.out.print("Enter Worker Data: ");
        System.out.print("\nName: ");
        String nameWorker = in.nextLine();
        System.out.print("\nLevel: ");
        WorkerLevel level = WorkerLevel.valueOf(in.nextLine());
        System.out.print("\nBase salary: ");
        Double salary = in.nextDouble();
        Worker worker = new Worker(nameWorker, level, salary, department);

        System.out.print("How many contracts to this worker? ");
        int nContracts = in.nextInt();
        in.nextLine();

        for (int i = 0; i < nContracts; i++){
            System.out.println("Enter contract #"+(i+1)+" data:");
            System.out.print("Date (DD/MM/YYYY): ");
            Date dateContract = sdf1.parse(in.nextLine());
            System.out.print("Value per hour: ");
            Double valuePerHour = in.nextDouble();
            System.out.print("Duration: ");
            Integer duration = in.nextInt();
            in.nextLine();
            HourContract contract = new HourContract(dateContract, valuePerHour, duration);
            worker.addContract(contract);
        }

        System.out.print("Enter month and year to calculate income (MM/YYYY): ");
        Date monthYear = sdf2.parse(in.nextLine());
        Calendar cal = Calendar.getInstance();
        cal.setTime(monthYear);
        int month = 1 + cal.get(Calendar.MONTH);
        //int month = Integer.parse(monthYear.substring(0, 2));
        int year = cal.get(Calendar.YEAR);
        //int month = Integer.parse(monthYear.substring(3));
        worker.showIncome(year, month);

    }
}
