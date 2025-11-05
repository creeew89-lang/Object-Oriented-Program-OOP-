package SpyAgentTracker;

import java.util.ArrayList;

public class Agency {
    private String agencyName;
    private ArrayList<Agent> agents;

    public Agency(String agencyName) {
        this.agencyName = agencyName;
        this.agents = new ArrayList<>();
    }

    public void addAgent(Agent agent) {
        agents.add(agent);
    }

    public void displayAllAgents() {
        System.out.println("Agency: " + agencyName);
        for (Agent agent : agents) {
            agent.display();
        }
    }

    public Agent finAgent(String codeName) {
        for (Agent agent : agents) {
            if (agent.getCodeName().equalsIgnoreCase(codeName))
                return agent;
        }
        return null;
    }
}
