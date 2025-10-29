package Vibe;

public class FoldablePhone extends SmartPhone{
    private String foldingMechanism;
    private int screenDurabilityFolds;
    private  double outerDisplaySize;

    @Override
    public String toString() {
        return "FoldablePhone{" +
                "screenDurabilityFolds=" + screenDurabilityFolds +
                '}';
    }
}

