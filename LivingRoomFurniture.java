package Vibe;

public class LivingRoomFurniture extends FurnitureItem{
    private String upholsteryMaterial;
    private int seatingCapacity;
    private boolean assemblyRequired;

    @Override
    public String toString() {
        return "LivingRoomFurniture{" +
                "seatingCapacity=" + seatingCapacity +
                '}';
    }
}
