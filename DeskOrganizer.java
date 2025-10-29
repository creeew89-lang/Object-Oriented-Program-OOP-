package Vibe;

public class DeskOrganizer extends StationeryItem{
    private int numberOfCompartments;
    private String material;
    private boolean stackable;

    @Override
    public String toString() {
        return "DeskOrganizer{" +
                "numberOfCompartments=" + numberOfCompartments +
                '}';
    }
}
