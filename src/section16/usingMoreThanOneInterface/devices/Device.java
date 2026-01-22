package section16.usingMoreThanOneInterface.devices;

public abstract class Device {

    private int serialNumber;

    public Device(int serialNumber) {
        this.serialNumber = serialNumber;
    }

    public void processDoc (String doc){}

    public int getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(int serialNumber) {
        this.serialNumber = serialNumber;
    }
}
