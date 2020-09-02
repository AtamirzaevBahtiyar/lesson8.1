package kg.geektech.les8.players;

import java.util.Random;

public class Golem extends Hero{

    public Golem(int health, int damage) {
        super(health, damage, SuperAbility.SAVE_DAMAGE_AND_REVERT);
    }

    @Override
    public void applySuperAbility(Boss boss, Hero[] heroes) {
        for (int i = 0; i < heroes.length; i++) {
            if (heroes[i] == this && boss.getDamage()>0){
                Random additionalDamage = new Random();
                int addDamage = (additionalDamage.nextInt(3)+1)*10;
                boss.setHealth(boss.getHealth() - addDamage);
                System.out.println("Golem применил способность " + addDamage);

            }

        }

    }
}
