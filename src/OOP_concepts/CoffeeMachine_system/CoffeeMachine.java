package OOP_concepts.CoffeeMachine_system;

public class CoffeeMachine {
    private int beans;
    private int water;

    CoffeeMachine(int beans, int water){
        if (beans < 0){
            throw new IllegalArgumentException("The beans units cannot be less than zero.");
        }
        if (water < 0){
            throw new IllegalArgumentException("The water units cannot be less than zero.");
        }
        this.beans = beans;
        this.water = water;
    }

    public int getBeans() {
        return beans;
    }

    public int getWater() {
        return water;
    }

    public boolean makeCoffee(){
        if (this.beans >= 5 && this.water >= 10){
            this.beans -= 5;
            this.water -= 10;
            return true;
        }
        return false;
    }
}
