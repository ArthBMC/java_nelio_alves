package section13.polimorfism.solvedExercise.entities;

import java.util.ArrayList;
import java.util.EnumMap;
import java.util.List;

public class Employee {
    private String name;
    private Integer hours;
    private Double valuePerHour;

    List<Employee> employeeList = new ArrayList<>();

    public Employee(){
    }

    public Employee(String name, Integer hours, Double valuePerHour) {
        this.name = name;
        this.hours = hours;
        this.valuePerHour = valuePerHour;
    }

    public void addEmployee (Employee employee){
        employeeList.add(employee);
    }

    public String toString () {
        StringBuilder sb = new StringBuilder();
        sb.append("\nPayments: \n");
        for (Employee e : employeeList) {
            sb.append(e.getName()).append(" - ").append("$ ").append(e.payment()).append("\n");
        }
        return sb.toString();
    }


    public double payment (){
        return hours*valuePerHour;
    }

    public String getName() {
        return name;
    }

    public Integer getHours() {
        return hours;
    }

    public Double getValuePerHour() {
        return valuePerHour;
    }
}
