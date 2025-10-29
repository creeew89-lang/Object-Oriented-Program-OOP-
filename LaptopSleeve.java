package Vibe;

public class LaptopSleeve extends LaptopBag{
    private String paddedLiningType;
    private String material;
    private double compatibleLaptopSize;

    @Override
    public String toString() {
        return "LaptopSleeve{" +
                "compatibleLaptopSize=" + compatibleLaptopSize +
                '}';
    }
}
