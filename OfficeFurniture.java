package Vibe;

public class OfficeFurniture extends FurnitureItem {
    private double ergonomicRating; // 0-10
    private String[] adjustabilityFeatures;
    private int weightCapacity; // kg

    @Override
    public String toString() {
        return "OfficeFurniture{capacity=" + weightCapacity + "kg}";
    }
}