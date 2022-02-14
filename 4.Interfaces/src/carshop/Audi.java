package carshop;

public class Audi extends CarImpl implements Rentable {

    private final Integer rentDays;
    private final Double priceForRentPerDay;

    public Audi(String model, String color, Integer horsePower, String countryOfProduce, Integer rentDays, Double priceForRentPerDay) {
        super(model, color, horsePower, countryOfProduce);
        this.rentDays = rentDays;
        this.priceForRentPerDay = priceForRentPerDay;
    }

    @Override
    public Integer getMinRentDay() {
        return rentDays;
    }

    @Override
    public Double getPricePerDay() {
        return priceForRentPerDay;
    }

    @Override
    public String toString() {
        return super.toString() + System.lineSeparator()
                + "Minimum rental period of " + rentDays + " days. Price per day " + priceForRentPerDay;
    }
}
