package kg.geektech.game.players;

import java.util.Random;

public class Witcher extends Hero{
    public static int count =0;


    public Witcher(int health, int damage, String name) {
        super(health, damage, SuperPower.CRITICAL_DAMAGE, name);
    }

    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {
        for (int i = 0; i < heroes.length; i++) {
            if (this != heroes[i] && heroes[i].getHealth() <= 0) {
               heroes[i].setHealth(200);
               this.setHealth(0);
            }
        }
    }
}
