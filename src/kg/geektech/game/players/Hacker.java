package kg.geektech.game.players;

import java.util.Random;

public class Hacker extends Hero {
    public Hacker(int health, int damage, String name) {
        super(health, damage, SuperPower.CRITICAL_DAMAGE, name);
    }

    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {
        Random r = new Random();
        int random = r.nextInt(5) + 8;
        for (int i = 0; i < heroes.length; i++) {
            if (this != heroes[i] && heroes[i].getHealth() <= 0) {
                boss.setHealth(boss.getHealth() - random);
                heroes[i].setHealth(heroes[i].getHealth() + random);
            }
        }
    }
}
