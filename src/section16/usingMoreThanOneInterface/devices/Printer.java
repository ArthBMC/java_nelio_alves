package section16.usingMoreThanOneInterface.devices;

public class Printer extends Device implements IinterfacePrinter {

    public Printer (int serialNumber) {
        super(serialNumber);
    }

    @Override
    public void processDoc (String doc){
        System.out.println("Printer processing: " + doc);
    }

    @Override
    public void print (String doc){
        System.out.println("Printing: "+doc);
    }
}
