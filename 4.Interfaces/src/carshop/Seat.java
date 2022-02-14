package carshop;

public class Seat extends CarImpl implements Sellable {

    private final Double price;

    public Seat(String model, String color, Integer horsePower, String countryOfProduce, Double price) {
        super(model, color, horsePower, countryOfProduce);
        this.price=price;
    }


    @Override
    public Double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return super.toString() +System.lineSeparator()+
                getModel()+ " sells for "+price;
    }
}
