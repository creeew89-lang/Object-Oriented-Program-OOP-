package HeroVillainSimulator;

public class Character {
    private String name;
    private String power;
    private int health;

    public Character(String name, String power, int health) {
        this.name = name;
        this.power = power;
        this.health = health;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPower() {
        return power;
    }

    public void setPower(String power) {
        this.power = power;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }
    public void takeDamage(int damage){
        health -= damage;
        if (health < 0){
            health = 0;
        }
    }
    public void displayStats(){
        System.out.println("Name: " + name);
        System.out.println("Power: " + power);
        System.out.println("Health" + health);
        System.out.println("-------------------");
    }

    public void attackHero(Hero hero) {
    }
}
