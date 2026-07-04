package Collections.PackageTracker_system;

import java.util.ArrayList;
import java.util.HashMap;

public class LogisticsSystem {
    private HashMap<Integer, Package> packageRegistry = new HashMap<>();
    private HashMap<String, ArrayList<Package>> cityIndex = new HashMap<>();

    public void addPackage(Package p) {
        if (doesPackageExist(p.getTrackingCode())){
            System.out.println("The package already exists.");
            return;
        }
        if (!cityIndex.containsKey(p.getDestinationCity())){ // checking if the city already exists in the map
            ArrayList<Package> packagesForCity = new ArrayList<>();
            cityIndex.put(p.getDestinationCity(), packagesForCity);
        }
        cityIndex.get(p.getDestinationCity()).add(p);
        packageRegistry.put(p.getTrackingCode(), p);
        System.out.println("Package added.");
    }

    public boolean doesPackageExist(int code) {
        return packageRegistry.containsKey(code);
    }

    public Package getPackageByCode(int code) {
        return packageRegistry.get(code);
    }

    public void removePackage(int code) { // difficult method
        if (!doesPackageExist(code)){
            System.out.println("The package does not exist.");
            return;
        }

        Package p = packageRegistry.get(code);
        String city = p.getDestinationCity();

        if (cityIndex.containsKey(city)) {
            cityIndex.get(city).remove(p);
            if (cityIndex.get(city).isEmpty()) {
                cityIndex.remove(city);
            }
        }
        packageRegistry.remove(code);
        System.out.println("Package removed.");
    }

    public void printPackagesByCity(String city) {
        if (cityIndex.containsKey(city)){
            System.out.println(cityIndex.get(city));
        }
    }
}
