package OOP_concepts.HomePower_system;

public class Appliance {
    String name;
    double consume;
    boolean isOn;
    static double totalConsume;

    static double totalCost(){
        return totalConsume * 0.15;
    }

    Appliance(String name, double consume, boolean isOn){
        this.name = name;
        this.consume = consume;
        this.isOn = isOn;
        if (isOn){
            isActive();
        }
    }

    Appliance(String name, boolean isOn){
        this(name, 100, isOn);
    }

    void isActive(){
        if (this.isOn) totalConsume += this.consume;
        else totalConsume -= this.consume;
    }

    void changeState(){
        this.isOn = !this.isOn;
    }
}
