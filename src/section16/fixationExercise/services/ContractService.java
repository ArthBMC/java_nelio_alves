package section16.fixationExercise.services;

import section16.fixationExercise.entities.Contract;
import section16.fixationExercise.entities.Installments;

import java.time.LocalDate;

public class ContractService {

    private OnlinePaymentService paymentService;

    public ContractService(OnlinePaymentService paymentService) {
        this.paymentService = paymentService;
    }

    public void processContract (Contract contract, Integer months){
        for (int i = 0; i < months; i++){
            double installmentValue = contract.getValue()/months;
            int month = i+1;
            LocalDate dueDate = contract.getDate().plusMonths(month);
            installmentValue += paymentService.interest(installmentValue,month);
            installmentValue += paymentService.paymentFee(installmentValue);
            contract.getInstallmentsList().add(new Installments(dueDate, installmentValue));
        }
    }

}
