package kg.geektech.les8.players;

public class Tank extends Hero {
    public Tank(int health, int damage) {
        super(health, damage, SuperAbility.TANK);
    }

    @Override
    public void applySuperAbility(Boss boss, Hero[] heroes) {
    int defense = boss.getDamage() / 5;
        for (int i = 0; i < heroes.length ; i++) {

            if (boss.getDamage()>0) {
                heroes[i].setHealth(heroes[i].getHealth() + defense);
                heroes[6].setHealth(heroes[6].getHealth() - defense);
            }
        }
        System.out.println("Танк защитил героев и принял урон на себя");
    }
}
