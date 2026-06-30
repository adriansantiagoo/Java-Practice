package OOP_concepts.SmartFueling_system;

public class Main {
    public static void main(String[] args){
        Car car = new Car(80, 80);
        Pump pump = new Pump(500);

        pump.refuelingProcess(car);

        System.out.println(car.getCurrentFuelLevel());
        System.out.println(pump.getFuelReservoir());
    }
}
