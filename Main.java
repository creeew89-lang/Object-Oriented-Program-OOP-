package OOPSystemDevices;

import java.util.ArrayList;

public class Main {
    public static void main(String []args) {

        ArrayList <Device> devices = new ArrayList<>();

        devices.add(new Device("TUF F15", "ASUS", 900.9));
        devices.add(new Device("S24 Ultra", "Samsung", 1250.9));
        devices.add(new Device("iPhone", "Apple", 700.7));
        devices.add(new Device("TV", "STARGOLD", 500));
        devices.add(new Device("ACI", "Asset", 400));

        System.out.println("Device Inventory:");
        for (Device d : devices){
            d.display();
        }
    }
}
