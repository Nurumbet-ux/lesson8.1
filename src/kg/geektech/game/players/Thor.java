package kg.geektech.game.players;

import kg.geektech.game.general.RPG_Game;

import java.util.Random;

public class Thor extends Hero{
    public static boolean isThor = false;


    public Thor(int health, int damage, String name) {
        super(health, damage, SuperPower.CRITICAL_DAMAGE, name);
    }

    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {
        Random r = new Random();
        int count = r.nextInt(2);
        if (count ==1){
            isThor = true;
        }
    }
}
