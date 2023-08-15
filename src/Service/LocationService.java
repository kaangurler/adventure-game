package Service;

import Characters.Character;
import Characters.Hero;
import Characters.Monster;
import Locations.Concrete.Cave;
import Locations.Concrete.Forest;
import Locations.Concrete.Mountain;
import Locations.Location;

public class LocationService {
    private final Location[] locations = {new Cave(), new Mountain(), new Forest()};

    public void combat(Hero hero, int atLocation) {
        Monster monster = locations[atLocation].getMonster();
        if (isAliveCheck(monster) && isAliveCheck(hero)) {
            if (isAliveCheck(hero)) {
                this.attack(hero, atLocation);
            }
            if (isAliveCheck(monster)) {
                this.defence(hero, atLocation);
            }
        }
        if (hero.getHealth() <= 0) {
            hero.setAlive(false);
        }
        if (monster.getHealth() <= 0) {
            monster.setAlive(false);
            hero.setCoin(hero.getCoin() + locations[atLocation].reward());
        }
    }

    private void attack(Hero hero, int atLocation) {
        Location location = locations[atLocation];
        Monster monster = location.getMonster();
        monster.setHealth(monster.getHealth() - (hero.getAttack() - monster.getDefence()));
    }

    private void defence(Hero hero, int atLocation) {
        Location location = locations[atLocation];
        Monster monster = location.getMonster();
        hero.setHealth(hero.getHealth() - (monster.getAttack() - hero.getDefence()));
    }

    private boolean isAliveCheck(Character character) {
        return character.getHealth() > 0;
    }

    public boolean obtainKey(Hero hero, int atLocation) {
        if (!locations[atLocation].getMonster().isAlive()) {
            hero.getKeys()[atLocation] = 1;
            return true;
        } else {
            return false;
        }
    }

    public String locationInfo(int atLocation) {
        return locations[atLocation].toString();
    }

    public String monsterInfo(int atLocation) {
        Monster monster = locations[atLocation].getMonster();
        if (!monster.isAlive()) {
            return monster.getName() + " is already dead";
        } else {
            return locations[atLocation].getMonster().toString();
        }
    }
}
