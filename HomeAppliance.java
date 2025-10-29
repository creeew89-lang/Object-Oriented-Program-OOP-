package Vibe;

public class HomeAppliance extends ElectronicItem{
    private String energyEfficiencyRating;
    private boolean smartHomeCompatibility;
    private String primaryFunction;

    @Override
    public String toString() {
        return "HomeAppliance{" +
                "primaryFunction='" + primaryFunction + '\'' +
                '}';
    }
}
