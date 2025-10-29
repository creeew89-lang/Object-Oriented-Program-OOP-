package Vibe;

public class BedroomFurniture extends FurnitureItem {
    private double storageVolume;
    private String mattressSizeCompatibility;
    private String frameMaterial;

    @Override
    public String toString() {
        return "BedroomFurniture{mattress=" + mattressSizeCompatibility + '}';
    }
}