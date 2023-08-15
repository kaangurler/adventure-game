package Locations.Concrete;

import Characters.Monster;
import Locations.Location;

public class Forest implements Location {
    private final String name = "Forest";
    private final Monster monster = new Monster("Demon", 25, 12);

    @Override
    public String getName() {
        return name;
    }

    @Override
    public Monster getMonster() {
        return this.monster;
    }

    @Override
    public int reward() {
        return 200;
    }

    @Override
    public String toString() {
        return this.getName();
    }
}
