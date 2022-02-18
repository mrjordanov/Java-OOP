package vechicle;



public class Car extends Vehicle {

    private static final double SUMMER_FUEL_REDUCE_PARAM = 0.9;

    public Car(double quantity, double consumptionPerLiter, int capacity) {
        super(quantity, consumptionPerLiter, capacity);
    }

    @Override
    public void setConsumptionPerLiter(double consumptionPerLiter) {
        super.setConsumptionPerLiter(consumptionPerLiter + SUMMER_FUEL_REDUCE_PARAM);
    }

}

