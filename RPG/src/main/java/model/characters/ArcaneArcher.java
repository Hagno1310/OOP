package main.java.model.characters;
import main.java.model.abilities.rangeAttack;
import main.java.model.abilities.spellCaster;

public class ArcaneArcher extends GameCharacter implements rangeAttack, spellCaster {
    private static final int ARROW_DAMAGE_BONUS = 5;
    private static final int SPELL_DAMAGE_BONUS = 10;

    public ArcaneArcher(String name, int hp, int baseDamage) {
        super(name, hp, baseDamage);
    }

    @Override
    public int attack() {
        System.out.println(name + " combines archery and magic in a single attack! (Damage: " + (baseDamage + ARROW_DAMAGE_BONUS + SPELL_DAMAGE_BONUS) + ")");

        return this.baseDamage + ARROW_DAMAGE_BONUS + SPELL_DAMAGE_BONUS;
    }

    @Override
    public void shootArrow() {
        System.out.println(name + " shoots a magical arrow! (Damage: " + (baseDamage + ARROW_DAMAGE_BONUS) + ")");
    }

    @Override
    public void castSpell() {
        System.out.println(name + " casts a mystical spell! (Damage: " + (baseDamage + SPELL_DAMAGE_BONUS) + ")");
    }
    
}
