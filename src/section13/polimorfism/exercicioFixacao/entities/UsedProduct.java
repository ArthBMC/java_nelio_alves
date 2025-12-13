package section13.polimorfism.exercicioFixacao.entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class UsedProduct extends Product{

    SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
    private final Date manufactureDate;


    public UsedProduct(String name, double price, Date manufactureDate) {
        super(name, price);
        this.manufactureDate = manufactureDate;
    }

    @Override
    public String priceTag (){
        return getName() + "(used) $ " + String.format("%.2f",getPrice()) + " (Manufacture date: " + sdf1.format(manufactureDate)+ ")";
    }


}
