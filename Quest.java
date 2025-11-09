package Quest;

import javax.xml.stream.Location;

public class Quest {
    private String title;
    private String description;
    private Location location;
    private int reward;
    private boolean isCompleted;

    public Quest(String title, String description, Location location, int reward, boolean isCompiled) {
        this.title = title;
        this.description = description;
        this.location = location;
        this.reward = reward;
        this.isCompleted = isCompleted;


    }



    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public int getReward() {
        return reward;
    }

    public void setReward(int reward) {
        this.reward = reward;
    }

    public boolean isCompiled() {
        return isCompleted;
    }

    public void setCompiled(boolean compiled) {
        isCompleted = compiled;
    }
    public void markCompleted(){
        this.isCompleted = true;
    }
}
