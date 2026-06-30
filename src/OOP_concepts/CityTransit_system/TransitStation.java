package OOP_concepts.CityTransit_system;

public class TransitStation {
    private String name;
    private StationConsole console;
    private Vehicle[] parkedVehicles;
    private int vehicleCount = 0;

    public TransitStation(String name, int capacity, String terminalId){
        this.name = name;
        this.console = new StationConsole(terminalId);
        this.parkedVehicles = new Vehicle[capacity];
    }

    public String getName() {
        return name;
    }

    public StationConsole getConsole() {
        return console;
    }

    public void vehicleArrive(Vehicle v){
        if (this.parkedVehicles.length == vehicleCount){
            System.out.println("The station is full.");
            return;
        }
        this.parkedVehicles[vehicleCount] = v;
        this.vehicleCount++;
    }

    public Vehicle vehicleDepart(String licensePlate){
        for (int i = 0; i < this.parkedVehicles.length; i++){
            if (this.parkedVehicles[i] != null){
                Vehicle currentVehicle = this.parkedVehicles[i];
                if (currentVehicle.getLicensePlate().equals(licensePlate)){
                    for (int j = i; j < parkedVehicles.length - 1; j++){
                        this.parkedVehicles[j] = this.parkedVehicles[j + 1];
                    }
                    this.parkedVehicles[parkedVehicles.length - 1] = null;
                    this.vehicleCount--;
                    return currentVehicle;
                }
            }
        }
        return null;
    }

    public void executeNightlyReport(){
        this.console.systemCheck();

        for (Vehicle v : parkedVehicles){
            if (v != null){
                v.move();
            }
        }
    }

    /*
    public Vehicle vehicleDepart(String licensePlate) {
    // Job 1: Find where the vehicle is
    int index = findVehicleIndex(licensePlate);

    // Guard clause: If it wasn't found, exit early
    if (index == -1) {
        return null;
    }

    Vehicle departingVehicle = this.parkedVehicles[index];

    // Job 2: Clean up the array
    shiftElementsLeft(index);
    this.vehicleCount--;

    return departingVehicle;
}

// HELPER METHOD 1: Responsibility is ONLY searching
private int findVehicleIndex(String licensePlate) {
    for (int i = 0; i < this.parkedVehicles.length; i++) {
        if (this.parkedVehicles[i] != null && this.parkedVehicles[i].getLicensePlate().equals(licensePlate)) {
            return i; // Found it! Return the position
        }
    }
    return -1; // Not found
}

// HELPER METHOD 2: Responsibility is ONLY shifting memory
private void shiftElementsLeft(int startIndex) {
    for (int j = startIndex; j < this.parkedVehicles.length - 1; j++) {
        this.parkedVehicles[j] = this.parkedVehicles[j + 1];
    }
    this.parkedVehicles[this.parkedVehicles.length - 1] = null;
}
     */
}
