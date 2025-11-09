package Quest;

public class Main {
     static void main(String[] args) {
        Location loc = new Location("Dark Forest", "North", true);
        Quest quest = new Quest("Rescue the Elf", "Find and rescue the lost elf",  loc, 100, true);

        System.out.println("Quest: " + quest.getTitle());
        System.out.println("Location: " + quest.getLocation());
        System.out.println("Reward: " + quest.getReward() + " gold");
    }
}
