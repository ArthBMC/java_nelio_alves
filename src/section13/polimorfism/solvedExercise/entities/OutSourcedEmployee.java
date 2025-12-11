package section13.polimorfism.solvedExercise.entities;

public class OutSourcedEmployee extends Employee{

    private double additionalCharge;

    public OutSourcedEmployee(String name, Integer hours, Double valuePerHour, double additionalCharge) {
        super(name, hours, valuePerHour);
        this.additionalCharge = additionalCharge;
    }

    @Override
    public double payment (){
        return super.payment()+additionalCharge();
    }

    public double additionalCharge (){
        return additionalCharge += additionalCharge*0.1;
    }

}
