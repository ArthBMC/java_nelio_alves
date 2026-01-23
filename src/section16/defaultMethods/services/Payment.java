package section16.defaultMethods.services;

import java.security.InvalidParameterException;

public interface Payment {

    Double getInterestRate();

    default Double payment (Double amount, int months){
        if (months < 1){
            throw new InvalidParameterException("Months must be greater than zero");
        }
        return amount * Math.pow(1 + getInterestRate() /100, months);
    }

}
