package Vibe;

public class BulkCarrier extends CargoShip {
    private long deadweightTonnage;
    private int cargoHoldCount;
    private String hatchCoverType;

    @Override
    public String toString() {
        return "BulkCarrier{DWT=" + deadweightTonnage + '}';
    }
}
