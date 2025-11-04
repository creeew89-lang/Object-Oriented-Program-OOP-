package SpySystem.Skeltons;

public class Agent {
    private String name;
    private String codeName;
    private String rank;

    public Agent(String name, String codeName, String rank) {
        this.name = name;
        this.codeName = codeName;
        this.rank = rank;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public String getCodeName() {
        return codeName;
    }

    public void setCodeName(String codeName) {
        this.codeName = codeName;
    }

    public void displayInfo() {
        System.out.println("Agent: " + name + "(" + codeName + "), Rank: " + rank);
    }
}

