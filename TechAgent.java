package SpySystem.Skeltons;

public class TechAgent extends Agent{
    private String[] gadgets;

    public TechAgent(String name, String codeName, String rank, String[] gadgets) {
        super(name, codeName, rank);
        this.gadgets = gadgets;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Gadgets: ");
        for (String g : gadgets){
            System.out.println("- "+ g);
        }
    }
}
