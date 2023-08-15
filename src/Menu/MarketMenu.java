package Menu;

import Characters.Hero;
import Service.MarketService;

import java.util.Arrays;
import java.util.Scanner;

public class MarketMenu {
    private final Hero hero;
    private final MarketService marketService = new MarketService();
    private final Scanner scanner = new Scanner(System.in);

    public MarketMenu(Hero hero) {
        this.hero = hero;
    }

    public void menu() {
        System.out.println("-----------------------------------");
        System.out.println(hero);
        System.out.println("1. Attack Tool\n2. Defence Tool\n3. Heal (75)\nEXIT");
        switch (scanner.nextInt()) {
            case 1 -> this.attackToolMenu();
            case 2 -> this.defenceToolMenu();
            case 3 -> this.marketService.buyHealPack(hero);
            default -> System.out.println("See you!");
        }
    }

    public void attackToolMenu() {
        Arrays.stream(marketService.getAttackTools()).forEach(System.out::println);
        if (!marketService.buyAttackTool(hero, scanner.nextInt())) {
            System.out.println("You already have an attack tool/Insufficient balance");
        }

    }

    public void defenceToolMenu() {
        Arrays.stream(marketService.getDefenceTools()).forEach(System.out::println);
        if (!marketService.buyDefenceTool(hero, scanner.nextInt())) {
            System.out.println("You already have a defence tool/Insufficient balance");
        }
    }


}
