package Locations.Concrete;

import Characters.Monster;
import Locations.Location;

public class Mountain implements Location {
    private final String name = "Mountain";
    private final Monster monster = new Monster("Werewolf", 20, 8);

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
        return 175;
    }

    @Override
    public String toString() {
        return this.getName();
    }
}
