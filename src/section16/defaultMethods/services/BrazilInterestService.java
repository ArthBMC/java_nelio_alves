package section16.defaultMethods.services;

public class BrazilInterestService implements Payment{

    private Double interestRate;

    public BrazilInterestService(Double fee) {
        this.interestRate = fee;
    }

    @Override
    public Double getInterestRate() {
        return interestRate;
    }
}
