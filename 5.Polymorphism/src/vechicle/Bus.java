package vechicle;

public class Bus extends Vehicle {

    private static final double SUMMER_FUEL_REDUCE_PARAM = 1.4;
    private boolean isEmpty;

    public Bus(double quantity, double consumptionPerLiter, int capacity) {
        super(quantity, consumptionPerLiter, capacity);
        this.isEmpty = true;
    }

    public void setEmpty(boolean state) {
        if (this.isEmpty == state) {
            return;
        }

        if (isEmpty && !state) {
            super.setConsumptionPerLiter(getConsumptionPerLiter() + SUMMER_FUEL_REDUCE_PARAM);
        }
        if (!isEmpty && state) {
            super.setConsumptionPerLiter(getConsumptionPerLiter() - SUMMER_FUEL_REDUCE_PARAM);
        }

        this.isEmpty = state;
    }
}

