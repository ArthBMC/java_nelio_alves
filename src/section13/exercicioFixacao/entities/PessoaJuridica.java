package section13.exercicioFixacao.entities;

public class PessoaJuridica extends Contribuinte{
    private int numberEmployees;


    public PessoaJuridica(String name, Double income, int numberEmployees) {
        super(name, income);
        this.numberEmployees = numberEmployees;
    }

    @Override
    public Double calculateTax (){
        if (numberEmployees <= 10){
            return getIncome()*0.16;
        }else
            return getIncome()*0.14;
    }



    public int getNumberEmployees() {
        return numberEmployees;
    }

    public void setNumberEmployees(int numberEmployees) {
        this.numberEmployees = numberEmployees;
    }
}
