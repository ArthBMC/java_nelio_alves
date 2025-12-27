package section13.exercicioFixacao.entities;

public abstract class Contribuinte {

    private Double income;
    private String name;

    public Contribuinte(String name, Double income) {
        this.name = name;
        this.income = income;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract Double calculateTax ();


    public Double getIncome() {
        return income;
    }

    public void setIncome(Double income) {
        this.income = income;
    }
}
