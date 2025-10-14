package main.java.model.characters;
import main.java.model.abilities.spellCaster;

public class Mage extends GameCharacter implements spellCaster {

    private static final int SPELL_DAMAGE_BONUS = 10;

    public Mage(String name, int hp, int baseDamage) {
        super(name, hp, baseDamage);
    }

    @Override
    public int attack() {
        this.castSpell();
        return baseDamage + SPELL_DAMAGE_BONUS;
    }

    @Override
    public void castSpell() {
        System.out.println(name + " casts a powerful spell! (Damage: " + (baseDamage + SPELL_DAMAGE_BONUS) + ")");
    }
    
}
