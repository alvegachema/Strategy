package Monsters;

import Abilities.Attack;

import java.util.HashMap;
import java.util.Objects;
import java.util.Random;

/**
 * Title: Strategy Homework Part 00
 * Abstract: The purpose of this assignment is to translate UMl to code, we also practice on creating different classes and to try to push the code to github.
 * Author: Alonso Vega
 * Date: 12/11/2021
 * Resources: I only used Mr. C magic
 */
public abstract class Monster {

    private Integer xp;
    private  Integer hp;
    private int maxHP;
    private HashMap<String, Integer> items;
    Attack attack;
    Integer strength;
    Integer defense;
    Integer agility;
    Integer agi;
    Integer def;
    Integer str;

    public Monster(Integer maxHP, Integer xp, HashMap<String, Integer> items) {
        //this.hp = hp;
        this.maxHP = maxHP;
        hp = this.maxHP;
        this.xp = xp;
        this.items = items;
        this.agi = 10;
        this.def = 10;
        this.str = 10;
    }

    //The following functions are the getters for agi, str, items, etc variables
    public Integer getAgi() {
        return agi;
    }

    public Integer getDef() {
        return def;
    }

    public Integer getStr() {
        return str;
    }

    public Integer getHp() {
        return hp;
    }

    public void setHp(Integer hp) {
        this.hp = hp;
    }

    public Integer getXp() {
        return xp;
    }

    public Integer getMaxHP() {
        return maxHP;
    }

    public void setMaxHP(int maxHP) {
        this.maxHP = maxHP;
    }

    public HashMap<String, Integer> getItems() {
        return items;
    }

    public void setItems(HashMap<String, Integer> items) {
        this.items = items;
    }

    //I made a change from the default "generate to string" option, the change was to delete a couple lines that were not necessary to get the correct output
    @Override
    public String toString() {
        return "= " + hp + "/" + maxHP;
    }

    //"This method calls the takeDamage(Integer) method of the creature that was passed in with the value for damage that is returned from the attack method as described below"
    public Integer attackTarget(Monster target)
    {
        if (hp <= 0) {
            attack.attack(target);
            target.takeDamage(0);
            return 0;
        }else {
            Integer integer = attack.attack(target);
            target.takeDamage(integer);
            return integer;
        }

    }

    //The following functions are the getters for attack, strength, agility, etc.
    public Attack getAttack() {
        return attack;
    }

    public Integer getStrength() {
        return strength;
    }

    public Integer getDefense() {
        return defense;
    }

    public Integer getAgility() {
        return agility;
    }

    //This function
    boolean takeDamage(Integer damage) {
        if( hp <= 0) {
            hp = 0;
            System.out.println("Oh no! the creature has perished!!");
        }
        if( damage >= 0) {
            System.out.println("The creatue was hit for" + damage + "damage!!");
        }

        System.out.println(this.toString());

        if (hp >= 0) { return true;}

        else{ return false;}

    }

    Integer getAttribute(Integer min, Integer max)
    {
        Random rand = new Random();
        if(min > max) {
            Integer temp = min;
            min = max;
            max = temp;
        }
        return rand.nextInt(max - min) + min;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Monster monster = (Monster) o;
        return getMaxHP() == monster.getMaxHP() && getXp().equals(monster.getXp()) && getHp().equals(monster.getHp()) && getItems().equals(monster.getItems()) && getAttack().equals(monster.getAttack()) && getStrength().equals(monster.getStrength()) && getDefense().equals(monster.getDefense()) && getAgility().equals(monster.getAgility());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getXp(), getHp(), getMaxHP(), getItems(), getAttack(), getStrength(), getDefense(), getAgility());
    }

}





