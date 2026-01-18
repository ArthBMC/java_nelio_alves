package section16.fixationExercise.entities;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Installments {
    private LocalDate dueDate;
    private Double amount;

    DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    public Installments(LocalDate dueDate, Double amount) {
        this.dueDate = dueDate;
        this.amount = amount;
    }

    public LocalDate getDueDate() {
        return dueDate;
    }

    public Double getAmount() {
        return amount;
    }

    @Override
    public String toString() {
        return dueDate.format(fmt) + " - " + String.format("$%.2f",amount);
    }


}
