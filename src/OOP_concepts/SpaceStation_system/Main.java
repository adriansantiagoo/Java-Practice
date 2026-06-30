package OOP_concepts.SpaceStation_system;

public class Main {
    public static void main(String[] args){
        Ship ship1 = new Ship("Millennium Falcon", 67, 80);
        Ship ship2 = new Ship("X-wing", 100);

        System.out.println("The total ships are " + Ship.totalShips);

        double fuelLevel1 = ship1.fuelLevel;
        double fuelLevel2 = ship2.fuelLevel;

        if (ship1.canMakeTrip(200)){
            System.out.println("The " + ship1.name + " can do the mission!");
        }
        else System.out.println("The " + ship1.name + " cannot do the mission!");

        if (ship2.canMakeTrip(200)){
            System.out.println("The " + ship2.name + " can do the mission!");
        }
        else System.out.println("The " + ship2.name + " cannot do the mission!");
    }
}
