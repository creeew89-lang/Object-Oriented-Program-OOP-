package HeroVillainSimulator;

import HeroVillainSimulator.Villain;

public class Hero extends Character {
    public Hero(String name, String power, int health) {
        super(name, power, health);
    }

    public void attackVillain(Villain villain) {
        System.out.println(getName() + " attacks " + villain.getName());
        villain.takeDamage(20);
    }
}
