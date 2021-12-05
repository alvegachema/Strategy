import java.util.HashMap;
import java.util.Objects;

/**
 * Title: Strategy Homework Part 00
 * Abstract: The purpose of this assignment is to translate UMl to code, we also practice on creating different classes and to try to push the code to github.
 * Author: Alonso Vega
 * Date: 11/28/2021
 * Resources: I only used Mr. C magic
 */
public class Monster {

    private int hp;
    private int xp;
    private int maxHP;
    private HashMap<String, Integer> items;

    public Monster(Integer maxHP, Integer xp, HashMap<String, Integer> items) {
        //this.hp = hp;
        this.maxHP = maxHP;
        hp = this.maxHP;
        this.xp = xp;
        this.items = items;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getXp() {
        return xp;
    }

/*    public void setXp(int xp) {
        this.xp = xp;
    }*/

    public int getMaxHP() {
        return maxHP;
    }

/*    public void setMaxHP(int maxHP) {
        this.maxHP = maxHP;
    }*/

    public HashMap<String, Integer> getItems() {
        return items;
    }

    public void setItems(HashMap<String, Integer> items) {
        this.items = items;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Monster monster = (Monster) o;
        return getHp() == monster.getHp() && getXp() == monster.getXp() && getMaxHP() == monster.getMaxHP() && getItems().equals(monster.getItems());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getHp(), getXp(), getMaxHP(), getItems());
    }

    //I made a change from the default "generate to string" option, the change was to delete a couple lines that were not necessary to get the correct output
    @Override
    public String toString() {
        return "= " + hp + "/" + maxHP;
    }
}
