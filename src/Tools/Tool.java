package Tools;

public class Tool {
    private final String name;
    private final int attack;
    private final int defence;
    private final int price;

    public Tool(String name, int attack, int defence, int price) {
        this.name = name;
        this.attack = attack;
        this.defence = defence;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getAttack() {
        return attack;
    }

    public int getDefence() {
        return defence;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return this.name + " - Attack/Defence: " + this.getAttack() + "/" + this.getDefence() + " - Price: " + this.getPrice()
                ;
    }
}
