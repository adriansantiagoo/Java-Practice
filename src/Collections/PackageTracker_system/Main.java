package Collections.PackageTracker_system;

public class Main {
    public static void main(String[] args) {
        LogisticsSystem warehouse = new LogisticsSystem();

        Package p1 = new Package(101, 2.5, "New York");
        Package p2 = new Package(102, 5.0, "Los Angeles");
        Package p3 = new Package(103, 1.2, "Chicago");

        // adding packages
        warehouse.addPackage(p1);
        warehouse.addPackage(p2);
        warehouse.addPackage(p3);
        System.out.println();

        // adding a duplicate package
        Package duplicatePackage = new Package(101, 10.0, "Miami");
        warehouse.addPackage(duplicatePackage);
        System.out.println();

        // tracking a package and founding it
        Package foundPackage = warehouse.getPackageByCode(102);
        System.out.println("Found: " + foundPackage);
        System.out.println();

        // tracking a package and failing
        Package missingPackage = warehouse.getPackageByCode(999);
        System.out.println("Looking for 999: " + missingPackage);
        System.out.println();

        // removing a package twice times
        warehouse.removePackage(103);
        warehouse.removePackage(103);
        System.out.println();

        warehouse.printPackagesByCity("New York");
    }
}