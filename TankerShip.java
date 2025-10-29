package Vibe;

public class TankerShip extends CargoShip {
    private double liquidCapacityCubicMeters;
    private String cargoType; // crude, LNG …
    private boolean doubleHullConstruction;

    @Override
    public String toString() {
        return "TankerShip{capacityM3=" + liquidCapacityCubicMeters + '}';
    }
}
