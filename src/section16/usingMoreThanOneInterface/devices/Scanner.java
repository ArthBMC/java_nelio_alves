package section16.usingMoreThanOneInterface.devices;

public class Scanner extends Device implements InterfaceScanner {

    public Scanner(int serialNumber) {
        super(serialNumber);
    }

    @Override
    public void processDoc (String doc){
        System.out.println("Scanner processing: " + doc);
    }

    @Override
    public void scan (String doc){
        System.out.println("Scan result: "+doc);
    }

}
