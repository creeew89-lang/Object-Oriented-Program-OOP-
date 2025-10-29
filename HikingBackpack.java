package Vibe;

public class HikingBackpack extends TravelBackpack {
    private boolean internalFrameSystem;
    private boolean hydrationReservoirCompatibility;
    private int volumeInLiters;

    @Override
    public String toString() {
        return "HikingBackpack{volume=" + volumeInLiters + "L}";
    }
}
