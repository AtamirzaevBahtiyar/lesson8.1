package kg.geektech.les8.players;

import java.util.Random;

public class Warrior extends Hero{
    public Warrior(int health, int damage) {
        super(health, damage, SuperAbility.CRITICAL_DAMAGE);
    }

    @Override
    public void applySuperAbility(Boss boss, Hero[] heroes) {
        Random additionalDamage = new Random();
        int critDamage = (additionalDamage.nextInt(3) + 2);
        for (int i = 0; i < heroes.length; i++) {
            if (heroes[i] == this){
            boss.setHealth(boss.getHealth() - ((heroes[i].getDamage()*critDamage)-heroes[i].getDamage()));
            System.out.println("Warrior применил критический урон " + critDamage * heroes[i].getDamage());}
        }

    }
}
