package OOP_concepts.EcoRide_system;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        Vehicle electricVehicle = new ElectricVehicle("Scooter", "SCT-101", 40, 80);
        Vehicle gasVehicle1 = new GasVehicle("Mustang", "MTG-203", 100);
        Vehicle electricBike = new ElectricVehicle("E-bike", "EBK-99", 20, 10);
        Vehicle electricVehicle2 = new ElectricVehicle("Dolphin", "BYD-300", 75, 5);

        System.out.println(electricVehicle);
        System.out.println(gasVehicle1);
        System.out.println(electricBike);
        System.out.println(electricVehicle2);

        Vehicle[] vehicles = {electricVehicle, gasVehicle1, electricBike, electricVehicle2};

        System.out.print("How many hours do you want? ");
        int hours = sc.nextInt();
        sc.nextLine();
        System.out.println();

        for (Vehicle v : vehicles){
            if (v.canRent()){
                double vehiclePrice = v.calculatePrice(hours);
                System.out.println("The " + v.getName() + ", ID " + v.getId() + ", will cost $" + vehiclePrice);
            }
            else System.out.println("The " + v.getName() + " cannot be rented.");
        }

        sc.close();
    }
}
