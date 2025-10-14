package main.java;
import main.java.model.characters.*;

public class Main {
    public static void main(String[] args) {
        GameCharacter warrior = new Warrior("Thorin", 150, 20);
        GameCharacter archer = new Archer("Legolas", 100, 15);
        GameCharacter mage = new Mage("Gandalf", 80, 25);
        GameCharacter arcaneArcher = new ArcaneArcher("Elrond", 90, 18);
        
        warrior.attack();
        archer.attack();
        mage.attack();
        arcaneArcher.attack();

        //Downcasting example
        if (arcaneArcher instanceof ArcaneArcher) {
            ((ArcaneArcher) arcaneArcher).shootArrow();
            ((ArcaneArcher) arcaneArcher).castSpell();
        }
    }
}
