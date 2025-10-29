package Vibe;

public class ExpeditionCruiseShip extends CruiserShip {
    private String iceClassRating;
    private int zodiacBoatFleetSize;
    private String destinationFocus; // polar, amazon …

    @Override
    public String toString() {
        return "ExpeditionCruiseShip{dest=" + destinationFocus + '}';
    }
}
