package Vibe;

public class WritingInstrument extends StationeryItem{
    private double pointSize;
    private String inkType;
    private boolean refillable;

    @Override
    public String toString() {
        return "WritingInstrument{" +
                "pointSize=" + pointSize +
                '}';
    }
}
