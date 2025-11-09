package HeroVillainSimulator;

public class Main {
    public static void main(String[] args) {
        Hero hero = new Hero("CyberKnight", "Hacking", 100);
        Villain villain = new Villain("DarkPhantom", "Malware", 100);

        System.out.println("Before battle:");
        hero.displayStats();
        villain.displayStats();

        hero.attackVillain(villain);
        villain.attackHero(hero);

        System.out.println("\nAfter battle:");
        hero.displayStats();
        villain.displayStats();
    }
}