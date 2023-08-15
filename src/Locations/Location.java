package Locations;

import Characters.Monster;

public interface Location {
    String getName();
    Monster getMonster();

    int reward();
}
