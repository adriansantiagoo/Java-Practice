package OOP_concepts.RPGCombat_system;

public class Archmage extends Mage{
    private double spellMultiplier;

    public Archmage(String name, double baseAttackPower, double mana, double spellMultiplier){
        super(name, baseAttackPower, mana);
        this.spellMultiplier = spellMultiplier;
    }

    public double getSpellMultiplier(){
        return spellMultiplier;
    }

    @Override
    public double calculateDamage(){
        return super.calculateDamage() * spellMultiplier;
    }
}