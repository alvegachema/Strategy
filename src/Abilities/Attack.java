package Abilities;

import Abilities.Ability;
import Monsters.Monster;

import java.util.Random;

public interface Attack extends Ability {

    Integer attack(Monster target);

/*    Integer getAttribute(Integer min, Integer max) {
        Random rand = new Random();
        if(min > max) {
            Integer temp = min;
            min = max;
            max = temp;
        }
        return rand.nextInt(max-min) + min;
    }*/

}
