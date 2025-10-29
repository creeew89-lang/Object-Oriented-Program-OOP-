package Vibe;

public class AircraftCarrier extends WarShip {
    private int aircraftCapacity;
    private String catapultSystemType;
    private double flightDeckArea;

    @Override
    public String toString() {
        return "AircraftCarrier{aircraft=" + aircraftCapacity + '}';
    }
}