package Characters;

public class Character {

    private final String name;
    private int health = 100;
    private int attack;
    private int defence;
    private boolean alive = true;

    public Character(String name, int attack, int defence) {
        this.name = name;
        this.attack = attack;
        this.defence = defence;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public void setDefence(int defence) {
        this.defence = defence;
    }

    public void setAlive(boolean alive) {
        this.alive = alive;
    }

    public String getName() {
        return this.name;
    }

    public int getHealth() {
        return this.health;
    }

    public int getAttack() {
        return this.attack;
    }

    public int getDefence() {
        return this.defence;
    }

    public boolean isAlive() {
        return alive;
    }

    @Override
    public String toString() {
        return this.getName() + " - Health: " + this.getHealth() + " - Attack/Defence: " + this.getAttack() + "/" + this.getDefence();
    }
}
