package section8.exerciciosFIxacao.exercicio2.entities;

public class Employee {
    private String name;
    private double grossSalary;
    private double tax;

    public double netSalary(){
        return grossSalary - tax;
    }

    public void increaseSalary(double percentage){
        grossSalary += (grossSalary*percentage)/100;
    }


    @Override
    public String toString (){
        return name
                +", $ "
                + String.format("%.2f",netSalary());
    }








    public void setName(String name) {
        this.name = name;
    }


    public void setGrossSalary(double grossSalary) {
        this.grossSalary = grossSalary;
    }


    public void setTax(double tax) {
        this.tax = tax;
    }
}
