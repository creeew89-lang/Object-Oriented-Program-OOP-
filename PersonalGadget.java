package Vibe;

public class PersonalGadget extends ElectronicItem{
    private int batteryLife;
    private double portabilityScore;
    private String[] connectivityOptions;

    @Override
    public String toString() {
        return "PersonalGadget{" +
                "batteryLife=" + batteryLife +
                '}';
    }
}
