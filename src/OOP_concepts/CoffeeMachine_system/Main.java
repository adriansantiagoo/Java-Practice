package OOP_concepts.CoffeeMachine_system;

public class Main {
    public static void main(String[] args){
        CoffeeMachine coffeeMachine = new CoffeeMachine(12, 15);

        boolean makeCoffee;

        for (int i = 0; i < 2; i++){
            makeCoffee = coffeeMachine.makeCoffee();
            if (makeCoffee){
                System.out.println("Success!");
            }
            else System.out.println("Insufficient units.");
        }
    }
}
