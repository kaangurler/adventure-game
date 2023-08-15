package Menu;

import Characters.Hero;

import java.util.Arrays;
import java.util.Scanner;

public class MainMenu {
    private final Hero hero;
    private final MarketMenu marketMenu;
    private final LocationMenu locationMenu;
    private final Scanner scanner = new Scanner(System.in);

    public MainMenu() {
        hero = new SelectMenu().menu();
        marketMenu = new MarketMenu(hero);
        locationMenu = new LocationMenu(hero);
    }

    public void menu() {
        boolean flag = true;
        while (hero.isAlive() && flag) {
            System.out.println("*******************************************************");
            System.out.print(hero + "\n1. Go\n2. Market\n3. Escape\n4. EXIT");
            switch (scanner.nextInt()) {
                case 1 -> locationMenu.menu();
                case 2 -> marketMenu.menu();
                case 3 -> {
                    if (Arrays.stream(hero.getKeys()).noneMatch(s -> s == 0)) {
                        System.out.println("You found all keys and able to return to the real world");
                        System.exit(1);
                    } else {
                        System.out.println("You do not have enough keys");
                    }
                }
                case 4 -> flag = false;
                default -> System.out.println("Please make a valid choice");
            }
        }
        System.out.println("GAME OVER");
    }
}
