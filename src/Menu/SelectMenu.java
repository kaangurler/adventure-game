package Menu;

import Characters.Hero;

import java.util.Scanner;

public class SelectMenu {
    private final Scanner scanner = new Scanner(System.in);

    public Hero menu() {
        Hero hero = null;
        System.out.print("1. Knight (Attack: 15 - Defence: 10)\n2. Archer (Attack: 20 - Defence: 5) ");
        switch (scanner.nextInt()) {
            case 1:
                hero = new Hero("Knight", 15, 10);
                System.out.println("You are a knight");
                break;
            case 2:
                hero = new Hero("Archer", 20, 5);
                System.out.println("You are an archer");
                break;
            default:
                System.out.println("Its not a valid choice");
                break;
        }
        return hero;
    }
}
