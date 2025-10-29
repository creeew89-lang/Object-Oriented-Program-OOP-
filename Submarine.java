package Vibe;

public class Submarine extends WarShip {
    private String propulsionSystem;
    private double maximumDepth;
    private int torpedoTubeCount;

    @Override
    public String toString() {
        return "Submarine{maxDepth=" + maximumDepth + "m}";
    }
}