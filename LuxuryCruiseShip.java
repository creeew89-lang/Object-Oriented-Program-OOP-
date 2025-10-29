package Vibe;

public class LuxuryCruiseShip extends CruiserShip {
    private double passengerToCrewRatio;
    private String suitSize;
    private String allInclusivePackageDetails;

    @Override
    public String toString() {
        return "LuxuryCruiseShip{" +
                "passengerToCrewRatio=" + passengerToCrewRatio +
                '}';
    }
}

