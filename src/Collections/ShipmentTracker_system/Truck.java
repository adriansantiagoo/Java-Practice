package Collections.ShipmentTracker_system;

import java.util.ArrayList;

public class Truck {
    ArrayList<Shipment> shipments = new ArrayList<>();
    private double maxCapacity;

    public Truck(double maxCapacity){
        this.maxCapacity = maxCapacity;
        this.shipments = null;
    }

    public double calculateCurrentWeight(){
        double currentWeight = 0;

        for (Shipment shipment : this.shipments){
            currentWeight += shipment.getWeight();
        }

        return currentWeight;
    }

    public boolean unloadShipment(int shipmentId){
        for (Shipment shipment : this.shipments){
            if (shipment.getId() == shipmentId){
                return false;
            }
        }
        return true;
    }

    public void loadShipment(Shipment shipment){
        if (!unloadShipment(shipment.getId())){
            return;
        }
        if (shipment.getWeight() + calculateCurrentWeight() > this.maxCapacity){
            return;
        }
        this.shipments.add(shipment);
    }

    public double getMaxCapacity() {
        return maxCapacity;
    }
}
