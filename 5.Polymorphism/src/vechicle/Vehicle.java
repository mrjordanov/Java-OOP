package vechicle;

import java.text.DecimalFormat;

public  class Vehicle implements Travel {
    private double quantity;
    private double consumptionPerLiter;
    private int capacity;

    protected Vehicle(double quantity, double consumptionPerLiter, int capacity) {
        this.quantity = quantity;
        this.setConsumptionPerLiter(consumptionPerLiter);
        this.capacity = capacity;
    }

    @Override
    public void refuel(double litters) {
        if (litters <= 0) {
            throw new IllegalArgumentException("Fuel must be a positive number");
        } else if (this.quantity + litters <= this.capacity) {
            this.quantity += litters;
        } else {
            throw new IllegalArgumentException("Cannot fit fuel in tank");
        }
    }

    @Override
    public String drive(double distance) {
        double consumedLitters = distance * this.getConsumptionPerLiter();
        if (consumedLitters <= this.getQuantity()) {
            double curFuel = this.getQuantity() - consumedLitters;
            this.setQuantity(curFuel);
            DecimalFormat formatter = new DecimalFormat("##.##");
            return String.format("%s travelled %s km", this.getClass().getSimpleName(), formatter.format(distance));
        }
        return this.getClass().getSimpleName() + " needs refueling";
    }

    @Override
    public void getInformation() {
        System.out.printf("%s: %.2f", getClass().getSimpleName(), getQuantity()).println();
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public double getQuantity() {
        return quantity;
    }

    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }

    public double getConsumptionPerLiter() {
        return consumptionPerLiter;
    }

    public void setConsumptionPerLiter(double consumptionPerLiter) {
        this.consumptionPerLiter = consumptionPerLiter;
    }
}
