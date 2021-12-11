package Abilities;

import Abilities.Attack;
import Monsters.Kobold;
import Monsters.Monster;

/**
 * Title: Strategy Homework Part 01
 * Abstract: The purpose of this assignment is to translate UMl to code, we also practice on creating different classes and to try to push the code to github.
 * Author: Alonso Vega
 * Date: 12/05/2021
 * Resources: I only used Mr. C magic
 */
public class RangedAttack implements Attack {

    Monster attacker;

    public RangedAttack(Monster attacker) {
        this.attacker = attacker;
    }

    @Override
    public Integer attack(Monster target) {
        String message = attacker + " uses a ranged attack on " + target;
        System.out.println(message);
        return attacker.getAgi() - target.getAgi();
    }
}
