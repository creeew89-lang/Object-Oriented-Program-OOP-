package Vibe;

public class ContainerShip extends CargoShip {
    private int twentyFootEquivalentUnitCapacity;
    private String craneType; // geared / gearless
    private long grossTonnage;

    @Override
    public String toString() {
        return "ContainerShip{TEU=" + twentyFootEquivalentUnitCapacity + '}';
    }
}
