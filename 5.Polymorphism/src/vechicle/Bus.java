package vechicle;

public class Bus extends Vehicle {

    private static final double SUMMER_FUEL_REDUCE_PARAM = 1.4;
    private boolean isEmpty;

    public Bus(double quantity, double consumptionPerLiter, int capacity) {
        super(quantity, consumptionPerLiter, capacity);
        isEmpty=false;
    }

    @Override
    public void setConsumptionPerLiter(double consumptionPerLiter) {
        if (!this.isEmpty){
            super.setConsumptionPerLiter(consumptionPerLiter + SUMMER_FUEL_REDUCE_PARAM);
        }
    }

    public void setEmpty(boolean empty) {
        isEmpty = empty;
    }
}

