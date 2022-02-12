package needforspeed;

public class SportCar extends Car{
    private static final double DEFAULT_FUEL_CONSUMPTION = 3;

    public SportCar(double fuel, int horsePower) {
        super(fuel, horsePower);
        this.setFuelConsumption(DEFAULT_FUEL_CONSUMPTION);
    }
}
