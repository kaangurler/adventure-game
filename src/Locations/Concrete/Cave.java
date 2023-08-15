package Locations.Concrete;

import Characters.Monster;
import Locations.Location;

public class Cave implements Location {
    private final String name = "Cave";
    private final Monster monster = new Monster("Vampire", 15, 5);

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
        return 150;
    }

    @Override
    public String toString() {
        return this.getName();
    }
}
