package section13.polimorfism.exercicioFixacao.entities;

public class ImportedProduct extends Product{
    private final double customsFee;

    public ImportedProduct(String name, double price, double customsFee) {
        super(name, price);
        this.customsFee = customsFee;
    }

    @Override
    public String priceTag(){
        return super.priceTag() + " (Custom fee: $ " + String.format("%.2f)", customsFee);
    }



}
