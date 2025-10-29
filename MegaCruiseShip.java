package Vibe;

public class MegaCruiseShip extends CargoShip {
    private int passengerCapacity;
    private int numberOfDecks;
    private String[] onboardAmenities;

    @Override
    public String toString() {
        return "MegaCruiseShip{guests=" + passengerCapacity + '}';
    }
}
