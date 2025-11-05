package SpyAgentTracker;

public class Agent {
    private String CodeName;
    private String mission;
    private String status;

    public Agent(String codeName, String mission, String status) {
        CodeName = codeName;
        this.mission = mission;
        this.status = status;
    }

    public String getCodeName() {
        return CodeName;
    }

    public void setCodeName(String codeName) {
        CodeName = codeName;
    }

    public String getMission() {
        return mission;
    }

    public void setMission(String mission) {
        this.mission = mission;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void display() {
        System.out.println("Agent: " + CodeName);
        System.out.println("Mission: " + mission);
        System.out.println("Status: " + status);
        System.out.println("--------------------------");
    }
}
