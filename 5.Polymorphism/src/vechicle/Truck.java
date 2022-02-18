package vechicle;



public class Truck extends Vehicle {

    private static final double SUMMER_FUEL_REDUCE_PARAM = 1.6;
    private static final double REFILL_PERCENTAGE = 0.95;


    public Truck(double quantity, double consumptionPerLiter, int capacity) {
        super(quantity, consumptionPerLiter, capacity);
    }

    @Override
    public void setConsumptionPerLiter(double consumptionPerLiter) {
        super.setConsumptionPerLiter(consumptionPerLiter+SUMMER_FUEL_REDUCE_PARAM);
    }

    @Override
    public void refuel(double litters) {
        super.refuel(litters * REFILL_PERCENTAGE);
    }

}
