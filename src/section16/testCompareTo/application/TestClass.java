package section16.testCompareTo.application;

import section16.testCompareTo.entities.Employee;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestClass {
    public static void main(String[] args) {


        File path = new File("/home/arth/Documentos/Java-Nelio/pasta de teste/employees.csv");
        List<Employee> list = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {

            String line = br.readLine();
            while (line != null) {
                String[] fields = line.split(",");
                Employee emp = new Employee(fields[0], Double.parseDouble(fields[1]));
                list.add(emp);
                line = br.readLine();
            }

            Collections.sort(list);
                for (Employee emp : list){
                    System.out.println(emp.getName() + ", " + emp.getSalary());
                }

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }


    }
}
