package Vibe;

public class PaperProduct extends StationeryItem{
    private int paperWeightGsm;
    private String sheetDimensions;
    private boolean acidFree;

    @Override
    public String toString() {
        return "PaperProduct{" +
                "paperWeightGsm=" + paperWeightGsm +
                '}';
    }
}
