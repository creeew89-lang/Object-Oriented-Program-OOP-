package SpySystem.Skeltons;

public class Mission {
    private String Location;
    private String target;
    private String status;

    public Mission(String location, String target, String status) {
        Location = location;
        this.target = target;
        this.status = status;
    }
    public void displayMission(){
        System.out.println("Mission in " + Location + " targeting " + target + " [" + status + "]" );
    }
}
