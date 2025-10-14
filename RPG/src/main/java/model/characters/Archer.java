package main.java.model.characters;
import main.java.model.abilities.rangeAttack;

public class Archer extends GameCharacter implements rangeAttack {

    private static final int ARROW_DAMAGE_BONUS = 5;

    public Archer(String name, int hp, int baseDamage) {
        super(name, hp, baseDamage);
    }

    @Override
    public int attack() {
        this.shootArrow();
        return this.baseDamage + ARROW_DAMAGE_BONUS;
    }

    @Override
    public void shootArrow() {
        System.out.println(name + " shoots an arrow! (Damage: " + (baseDamage + ARROW_DAMAGE_BONUS) + ")");
    }

}
