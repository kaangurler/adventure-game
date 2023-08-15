package Menu;

import Characters.Hero;
import Service.LocationService;

import java.util.Scanner;

public class LocationMenu {

    private final Hero hero;
    private final LocationService locationService = new LocationService();
    private final Scanner scanner = new Scanner(System.in);

    public LocationMenu(Hero hero) {
        this.hero = hero;
    }

    public void menu() {
        System.out.println("------------------------------------");
        System.out.println("1. Cave -> " + locationService.monsterInfo(0) +
                "\n2. Mountain -> " + locationService.monsterInfo(1) + "" +
                "\n3. Forest -> " + locationService.monsterInfo(2) +
                "\n4. Back to Main Menu");
        switch (scanner.nextInt()) {
            case 1:
                this.combatMenu(0);
                break;
            case 2:
                this.combatMenu(1);
                break;
            case 3:
                this.combatMenu(2);
                break;
            case 4:
                break;
            default:
                System.out.println("Invalid choice");
                break;
        }
    }

    public void combatMenu(int atLocation) {
        boolean flag = true;
        while (flag) {
            System.out.println("--------------------------------------");
            System.out.println(hero);
            System.out.println("You are at the " + locationService.locationInfo(atLocation) + ". " + locationService.monsterInfo(atLocation));
            System.out.println("1. Combat\n2. Get Key\n3. Back");
            switch (scanner.nextInt()) {
                case 1 -> locationService.combat(hero, atLocation);
                case 2 -> {
                    boolean hasKey = locationService.obtainKey(hero, atLocation);
                    if (hasKey) {
                        System.out.println("You have got the key");
                    } else {
                        System.out.println("You cannot get the key. There is still a monster alive");
                    }
                }
                case 3 -> flag = false;
                default -> System.out.println("Invalid choice");
            }
        }
    }
}
