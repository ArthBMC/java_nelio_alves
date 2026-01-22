package section16.usingMoreThanOneInterface.devices;

public class Hybrid extends Device implements IinterfacePrinter, InterfaceScanner {

    public Hybrid(int serialNumber) {
        super(serialNumber);
    }

    @Override
    public void processDoc (String doc){
        System.out.println("Hybrid processing: " + doc);
    }

    @Override
    public void print (String doc){
        System.out.println("Printing: "+doc);
    }

    @Override
    public void scan (String doc){
        System.out.println("Scan result: "+doc);
    }

}
