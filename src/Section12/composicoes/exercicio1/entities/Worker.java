package Section12.composicoes.exercicio1.entities;

import Section12.composicoes.exercicio1.entitiesEnum.WorkerLevel;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Worker {
    private String name;
    private WorkerLevel workerLevel;
    private Double baseSalary;

    private Department department;
    private List<HourContract> contracts = new ArrayList<>();

    public Worker(String name, WorkerLevel workerLevel, Double baseSalary, Department department) {
        this.name = name;
        this.workerLevel = workerLevel;
        this.baseSalary = baseSalary;
        this.department = department;
    }


    public void addContract (HourContract contract){
        contracts.add(contract);
    }

    public void removeContract (HourContract contract) {
        contracts.remove(contract);
    }

    public Double income (int year, int month){
        double sum = baseSalary;
        Calendar cal = Calendar.getInstance();
        for(HourContract c: contracts){
            cal.setTime(c.getDate());
            int c_year = cal.get(Calendar.YEAR);
            int c_month = 1 + cal.get(Calendar.MONTH);
            if (c_year == year && c_month == month){
                sum += c.totalValue();
            }
        }
        return sum ;
    }

    public void showIncome (int year,int month){
        System.out.println("Name: "+ this.name);
        System.out.println("Department: "+ this.department);
        System.out.println("Income for "+year+"/"+month+": "+ String.format("%.2f",income(year, month)));
    }
}
