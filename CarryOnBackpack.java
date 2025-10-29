package Vibe;

public class CarryOnBackpack extends TravelBackpack {
    private String airlineComplianceDimensions;
    private boolean tsaFriendlyLaptopCompartment;
    private boolean stowableShoulderStraps;

    @Override
    public String toString() {
        return "CarryOnBackpack{TSA=" + tsaFriendlyLaptopCompartment + '}';
    }
}
