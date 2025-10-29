package Vibe;

public class Destroyer extends WarShip {
    private String missileSystem;
    private String sonarCapabilities;
    private double topSpeedKnots;

    @Override
    public String toString() {
        return "Destroyer{missiles=" + missileSystem + '}';
    }
}
