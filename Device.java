package NetworkdefenderOPP;

public class Device {
    protected String brand;
    protected String ipAddress;


    public Device(String brand, String ipAddress) {
        this.brand = brand;
        this.ipAddress = ipAddress;
    }

    public void displayInfo() {
        System.out.println("Brand: " + brand + ", IP: " + ipAddress);

    }
}
