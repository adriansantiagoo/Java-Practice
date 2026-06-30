package OOP_concepts.HomePower_system;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        Appliance appliance1 = new Appliance("Toaster", 1200.0, true);
        Appliance appliance2 = new Appliance("Lamp", false);

        boolean wantChange1, wantChange2;

        System.out.println("The " + appliance1.name + " is on.");
        System.out.println("The " + appliance2.name + " is off.");
        System.out.println("The current total consume is " + Appliance.totalConsume);
        System.out.println();

        System.out.printf("Want change the state of the %s? ", appliance1.name);
        wantChange1 = sc.nextBoolean();
        if (wantChange1){
            appliance1.changeState(); // need this to update the state
            appliance1.isActive(); // need this to update the totalConsume
        }

        System.out.printf("Want change the state of the %s? ", appliance2.name);
        wantChange2 = sc.nextBoolean();
        if (wantChange2){
            appliance2.changeState(); // need this to update the state
            appliance2.isActive(); // need this to update the totalConsume
        }

        System.out.println("The total consume now is " + Appliance.totalConsume);
        System.out.println("The total cost is $" + Appliance.totalCost());

        sc.close();
    }
}
