package Vibe;

public class CrossbodyBag extends HandBag {
    private boolean strapAdjustability;
    private int numberOfPockets;
    private String dimensions; // HxWxD cm

    @Override
    public String toString() {
        return "CrossbodyBag{pockets=" + numberOfPockets + '}';
    }
}
