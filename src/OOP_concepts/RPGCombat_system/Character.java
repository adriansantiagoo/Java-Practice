package OOP_concepts.RPGCombat_system;

public class Character {
    private String name;
    private double baseAttackPower;

    public Character(String name, double baseAttackPower){
        this.name = name;
        this.baseAttackPower = baseAttackPower;
    }

    public String getName(){
        return name;
    }

    public double getBaseAttackPower(){
        return baseAttackPower;
    }

    public double calculateDamage(){
        return baseAttackPower;
    }
}