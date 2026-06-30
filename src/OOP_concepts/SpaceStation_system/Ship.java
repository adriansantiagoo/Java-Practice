package OOP_concepts.SpaceStation_system;

public class Ship {
    static int totalShips = 0;
    static String stationName = "Alpha Base One";
    String name;
    int registryNumber;
    double fuelLevel;

    static double convertFuelToLY(double fuelLevel){
        return fuelLevel * 2;
    }

    // main constructor
    Ship(String name, int registryNumber, double fuelLevel){
        this.name = name;
        this.registryNumber = registryNumber;
        this.fuelLevel = fuelLevel;
        totalShips++;
    }

    Ship(String name, int registryNumber){
        this(name, registryNumber, 100);
    }

    boolean canMakeTrip(double distance){
        double fuelNeeded = distance / 2; // calculate how much fuel we need for this distance
        return this.fuelLevel >= fuelNeeded; // check if our current fuelLevel is enough
    }
}