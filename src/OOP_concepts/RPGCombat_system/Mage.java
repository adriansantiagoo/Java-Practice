package OOP_concepts.RPGCombat_system;

public class Mage extends Character{
    private double mana;

    public Mage(String name, double baseAttackPower, double mana){
        super(name, baseAttackPower);
        this.mana = mana;
    }

    public double getMana(){
        return mana;
    }

    @Override
    public double calculateDamage(){
        return super.calculateDamage() + 0.5 * mana;
    }
}