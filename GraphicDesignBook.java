package Vibe;

public class GraphicDesignBook extends DesignBook{
    private String typographyFocus;
    private String colorTheorySection;
    private boolean softwareTutorialsIncluded;

    @Override
    public String toString() {
        return "GraphicDesignBook{" +
                "softwareTutorialsIncluded=" + softwareTutorialsIncluded +
                '}';
    }
}
