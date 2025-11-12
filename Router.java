package NetworkdefenderOPP;

public class Router extends Device{
    private int numberOdPorts;

    public Router(String brand, String ipAddress, int numberOdPorts) {
        super(brand, ipAddress);
        this.numberOdPorts = numberOdPorts;
    }

    public void displayRouterInfo(){
        displayInfo();
        System.out.println("Ports: " + numberOdPorts);
    }
}
