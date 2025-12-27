package section13.exercicioFixacao.entities;

public class PessoaFisica extends Contribuinte{
    private Double health;

    public PessoaFisica(String name,Double income, Double health) {
        super(name, income);
        this.health = health;
    }

    @Override
    public Double calculateTax() {
        if (getIncome() < 20000) {
            return (getIncome() * 0.15) - (health * 0.5);
        }else {
            return (getIncome() * 0.25) - (health * 0.5);
        }
    }

    public Double getHealth() {
        return health;
    }

    public void setHealth(Double health) {
        this.health = health;
    }
}
