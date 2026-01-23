package section16.defaultMethods.services;

public class UsaInterestService implements Payment {

    private Double interestRate;

    public UsaInterestService(Double interestRate) {
        this.interestRate = interestRate;
    }

    @Override
    public Double getInterestRate() {
        return interestRate;
    }
}
