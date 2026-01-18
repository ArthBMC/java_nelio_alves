package section16.fixationExercise.entities;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Contract {
    private Integer number;
    private LocalDate date;
    private Double value;

    private  List<Installments> installmentsList = new ArrayList<>();

    public Contract(Integer number, LocalDate date, Double value) {
        this.number = number;
        this.date = date;
        this.value = value;
    }


    public Integer getNumber() {
        return number;
    }


    public LocalDate getDate() {
        return date;
    }

    public List<Installments> getInstallmentsList() {
        return installmentsList;
    }

    public Double getValue() {
        return value;
    }

}
