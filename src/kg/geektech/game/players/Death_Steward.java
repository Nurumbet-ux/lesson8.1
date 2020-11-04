package kg.geektech.game.players;

import java.util.Random;

public class Death_Steward extends Hero{
    public static int counter =0;

    public Death_Steward(int health, int damage, String name) {
        super(health, damage, SuperPower.CRITICAL_DAMAGE, name);
    }

    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {
        for (int i = 0; i < heroes.length; i++) {
            if (heroes[i].getHealth() ==0){
                counter++;
                if (counter==5){
                    boss.setHealth(0);
                }
               
            }

        }
    }
}
