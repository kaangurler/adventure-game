package Service;

import Characters.Hero;
import Tools.AttackTool;
import Tools.DefenceTool;
import Tools.Tool;

public class MarketService {

    AttackTool[] attackTools = {new AttackTool("Light Pack", 5, -3, 75),
            new AttackTool("Regular Pack", 7, -3, 100),
            new AttackTool("Heavy Pack", 9, -3, 125),
    };
    DefenceTool[] defenceTools = {new DefenceTool("Light Armor", -3, 5, 75),
            new DefenceTool("Regular Armor", -3, 6, 100),
            new DefenceTool("Heavy Armor", -3, 7, 125)
    };

    public AttackTool[] getAttackTools() {
        return attackTools;
    }

    public DefenceTool[] getDefenceTools() {
        return defenceTools;
    }

    public boolean buyAttackTool(Hero hero, int attackTool) {
        if (hero.getAttackTool() == null && hero.getCoin() >= attackTools[attackTool - 1].getPrice()) {
            hero.setAttackTool(attackTools[attackTool - 1]);
            hero.setAttack(hero.getAttack() + hero.getAttackTool().getAttack());
            hero.setDefence(hero.getDefence() + hero.getAttackTool().getDefence());
            hero.setCoin(hero.getCoin() - attackTools[attackTool - 1].getPrice());
            return true;
        } else {
            return false;
        }
    }

    public boolean buyDefenceTool(Hero hero, int defenceTool) {
        if (hero.getDefenceTool() == null && hero.getCoin() >= defenceTools[defenceTool - 1].getPrice()) {
            hero.setDefenceTool(defenceTools[defenceTool - 1]);
            hero.setAttack(hero.getAttack() + hero.getDefenceTool().getAttack());
            hero.setDefence(hero.getDefence() + hero.getDefenceTool().getDefence());
            hero.setCoin(hero.getCoin() - defenceTools[defenceTool - 1].getPrice());
            return true;
        } else {
            return false;
        }

    }

    public boolean buyHealPack(Hero hero) {
        if (hero.getCoin() >= 75) {
            hero.setHealth(100);
            hero.setCoin(hero.getCoin() - 75);
            return true;
        }
        return false;
    }
}
