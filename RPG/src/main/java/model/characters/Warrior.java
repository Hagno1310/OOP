package main.java.model.characters;

public class Warrior extends GameCharacter {
    public Warrior(String name, int hp, int baseDamage) {
        super(name, hp, baseDamage);
    }

    @Override
    public int attack() {
        System.out.println(name + " swings a mighty sword! (Damage: " + (baseDamage + 10) + ")");
        
        return this.baseDamage + 10;
    }
    
}
