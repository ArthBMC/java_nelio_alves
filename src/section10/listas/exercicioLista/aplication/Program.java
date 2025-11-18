package section10.listas.exercicioLista.aplication;

import section10.listas.exercicioLista.entities.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("How many employees will be registered? ");
        int n = in.nextInt();
        in.nextLine();

        List<Employee> employeeList = new ArrayList<>();

        for (int i = 0; i < n; i++){
            System.out.println("Employee #"+(i+1)+":");
            System.out.print("Id: ");
            int idT = in.nextInt();
            while(hasId(employeeList, idT)){
                System.out.print("This id has already taken! Try again: ");
                idT = in.nextInt();
            }
            in.nextLine();
            System.out.print("Name: ");
            String nameT = in.nextLine();
            System.out.print("Salary: ");
            double salaryT = in.nextDouble();
            Employee employees = new Employee(idT, nameT, salaryT);
            employeeList.add(employees);
            System.out.println();
        }

        System.out.print("Enter the employee id that will have salary increase : ");
        int idIncreased = in.nextInt();
        boolean notExists = employeeList.stream().filter(Employee -> Employee.getId() == idIncreased).findFirst().isEmpty();
        if (!notExists) {
            System.out.print("Enter the percentage : ");
            double percentage = in.nextDouble();
            employeeList.stream().filter(Employee -> Employee.getId() == idIncreased).findFirst()
                    .ifPresent(Employee -> Employee.increaseSalary(percentage));
        }else {
            System.out.println("This id does not exists!\n");
        }

        System.out.println("\nList of employees: ");
        for (Employee x : employeeList){
            System.out.println(x);
        }



        in.close();
    }

    public static boolean hasId (List<Employee> employeeList, int id){
        Employee emp = employeeList.stream().filter(Employee -> Employee.getId() == id).findFirst().orElse(null);
        return emp != null;
    }




}
