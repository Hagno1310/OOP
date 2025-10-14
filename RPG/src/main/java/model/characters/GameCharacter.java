package main.java.model.characters;

public abstract class GameCharacter {
    protected String name;
    protected int hp;
    protected int baseDamage;

    public GameCharacter(String name, int hp, int baseDamage) {
        this.name = name;
        this.hp = hp;
        this.baseDamage = baseDamage;
    }

    public abstract int attack();
}
