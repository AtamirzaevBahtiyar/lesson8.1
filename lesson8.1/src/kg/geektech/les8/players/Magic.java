package kg.geektech.les8.players;

import java.util.Random;

public class Magic extends Hero {
    public Magic(int health, int damage) {
        super(health, damage, SuperAbility.BOOST);
    }

    @Override
    public void applySuperAbility(Boss boss, Hero[] heroes) {
        Random additionalBoost = new Random();
        int addBoost = (additionalBoost.nextInt(3) + 1);
        for (int i = 0; i < heroes.length; i++) {
            if (heroes[i] != this)
            boss.setHealth(boss.getHealth() - ((heroes[i].getDamage()*addBoost)-heroes[i].getDamage()));
        }
        System.out.println("Magic увеличил урон героев на " + addBoost);

    }
}
