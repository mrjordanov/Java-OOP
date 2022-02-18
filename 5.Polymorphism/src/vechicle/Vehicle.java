package vechicle;

import java.text.DecimalFormat;

public abstract class Vehicle implements Travel {
    private double quantity;
    private double consumptionPerLiter;

    protected Vehicle(double quantity, double consumptionPerLiter) {
        this.quantity = quantity;
        this.setConsumptionPerLiter(consumptionPerLiter);
    }

    @Override
    public void refuel(double litters) {
        this.quantity += litters;
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
