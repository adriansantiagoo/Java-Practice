package OOP_concepts.RPGCombat_system;

public class Main {
    public static void main(String[] args){
        Character character = new Character("Garen", 15);
        Mage mage = new Mage("Ryze", 10, 30);
        Archmage archmage = new Archmage("Syndra", 10, 30, 2);

        double baseAttackPowerCharacter = character.getBaseAttackPower();
        double baseAttackPowerMage = mage.getBaseAttackPower();
        double baseAttackPowerArchmage = archmage.getBaseAttackPower();

        Character[] typesCharacters = {character, mage, archmage};

        for (Character type : typesCharacters){
            System.out.println(type.getName() + " " + type.calculateDamage());
        }
    }
}