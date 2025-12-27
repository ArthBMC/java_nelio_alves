package section13.exercicioFixacao.entities;

public class PessoaFisica extends Contribuinte{
    private Double health;

    public PessoaFisica(String name,Double income, Double health) {
        super(name, income);
        this.health = health;
    }

    @Override
    public Double calculateTax() {
        double tax = 0.0;
        if (getIncome() < 20000) {
            tax = (getIncome() * 0.15) - (health * 0.5);
        }else {
            tax = (getIncome() * 0.25) - (health * 0.5);
        }
        if (tax < 0){
            tax = 0.0;
        }
        return tax;
    }

    public Double getHealth() {
        return health;
    }

    public void setHealth(Double health) {
        this.health = health;
    }
}
