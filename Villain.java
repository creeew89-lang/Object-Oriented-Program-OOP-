package HeroVillainSimulator;


public class Villain extends Character {

    public Villain(String name, String power, int health) {
        super(name, power, health);
    }

    public void attackHero(Hero hero) {
        System.out.println(getName() + " attacks " + hero.getName());
        hero.takeDamage(15);
    }
}