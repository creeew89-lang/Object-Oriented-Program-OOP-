package SpyAgentTracker;

public class Main {
    public static void main(String[] args) {
        Agent a1 = new Agent("Ghost Team", "Infiltrate HQ", "Active");
        Agency agency = new Agency("Omega Ops");
        agency.addAgent(a1);
        agency.displayAllAgents();
    }
}
