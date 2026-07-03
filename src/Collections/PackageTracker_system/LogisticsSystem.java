package Collections.PackageTracker_system;

import java.util.HashMap;

public class LogisticsSystem {
    private HashMap<Integer, Package> packageRegistry = new HashMap<>();

    public void addPackage(Package p) {
        if (doesPackageExist(p.getTrackingCode())){
            System.out.println("The package already exists.");
            return;
        }
        packageRegistry.put(p.getTrackingCode(), p);
        System.out.println("Package added.");
    }

    public boolean doesPackageExist(int code) {
        return packageRegistry.containsKey(code);
    }

    public Package getPackageByCode(int code) {
        return packageRegistry.get(code);
    }

    public void removePackage(int code) {
        if (!doesPackageExist(code)){
            System.out.println("The package does not exist.");
            return;
        }
        packageRegistry.remove(code);
        System.out.println("Package removed.");
    }
}
