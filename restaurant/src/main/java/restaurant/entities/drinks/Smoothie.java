package restaurant.entities.drinks;

public class Smoothie extends BaseBeverages {

    private final double SMOOTHIE_PRICE = 4.50;

    public Smoothie(String name, int counter, double price, String brand) {
        super(name, counter, price, brand);
    }


    @Override
    public void setPrice(double price) {
        super.setPrice(SMOOTHIE_PRICE);
    }
}
