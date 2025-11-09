package Quest;

public class Location {
    private String name;
    private String region;
    private boolean isDangerous;

    public Location(String name, String region, boolean isDangerous) {
        this.name = name;
        this.region = region;
        this.isDangerous = isDangerous;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public boolean isDangerous() {
        return isDangerous;
    }

    public void setDangerous(boolean dangerous){
        isDangerous = dangerous;
    }
}
