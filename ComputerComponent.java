package Vibe;

public class ComputerComponent extends ElectronicItem{
    private String compatibilitySocket;
    private int performanceBenchmark;
    private int powerConsumption;

    @Override
    public String toString() {
        return "ComputerComponent{" +
                "compatibilitySocket='" + compatibilitySocket + '\'' +
                '}';
    }
}
