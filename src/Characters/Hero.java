package Characters;

import Tools.AttackTool;
import Tools.DefenceTool;

public class Hero extends Character {
    private DefenceTool defenceTool;
    private AttackTool attackTool;
    private int[] keys = {0, 0, 0};

    private int coin = 100;

    public Hero(String name, int attack, int defence) {
        super(name, attack, defence);
    }

    public void setDefenceTool(DefenceTool defenceTool) {
        this.defenceTool = defenceTool;
    }

    public void setAttackTool(AttackTool attackTool) {
        this.attackTool = attackTool;
    }

    public void setCoin(int coin) {
        this.coin = coin;
    }

    public DefenceTool getDefenceTool() {
        return this.defenceTool;
    }

    public AttackTool getAttackTool() {
        return this.attackTool;
    }

    public int[] getKeys() {
        return keys;
    }

    public int getCoin() {
        return coin;
    }

    @Override
    public String toString() {
        String str = this.getName() + " - Health: " + this.getHealth() + " - Attack/Defence: " + this.getAttack() + "/" + this.getDefence() + " - Coin: " + this.getCoin();
        if (this.getAttackTool() != null && this.getDefenceTool() != null) {
            str += " - Attack Tool: " + this.getAttackTool().getName() + " - Defence Tool: " + this.getDefenceTool().getName();
        } else if (this.getAttackTool() != null && this.getDefenceTool() == null) {
            str += " - Attack Tool: " + this.getAttackTool().getName();
        } else if (this.getAttackTool() == null && this.getDefenceTool() != null) {
            str += " - Defence Tool: " + this.getDefenceTool().getName();
        }
        return str;
    }
}
