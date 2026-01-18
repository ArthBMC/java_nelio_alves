package section16.fixationExercise.services;

public interface OnlinePaymentService {

    public Double paymentFee (Double amount);
    public Double interest (Double amount, Integer months);

}
