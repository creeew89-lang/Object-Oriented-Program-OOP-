package SpySystem.Skeltons;

import java.lang.reflect.Field;

public class SpyTest {
    public static void main(String []args){
        FieldAgent agent1 = new FieldAgent("Muiayed", "Ghost" , "Underocver" , "141");
        FieldAgent agent2 = new FieldAgent("Mohammed", "Sambi" , "Captin" , "141");

        Mission mission = new Mission("Ghala" , "Mactavish", "Active");
        System.out.println("Agent Profiles");
        agent1.displayInfo();
        agent1.displayInfo();
        agent2.displayInfo();
        agent2.displayInfo();

        System.out.println("Mission Brief");
        mission.displayMission();
    }
}
