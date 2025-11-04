package SpySystem.Skeltons;

public class FieldAgent extends Agent{
    private String disguise;

    public FieldAgent(String name, String codeName, String rank, String disguise) {
        super(name, codeName, rank);
        this.disguise = disguise;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Disguise: " + disguise);
    }
}
