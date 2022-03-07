package restaurant.entities.drinks;

public class Fresh extends BaseBeverages {

    private final double FRESH_PRICE = 3.50;

    protected Fresh(String name, int counter, double price, String brand) {
        super(name, counter, price, brand);
    }

    @Override
    public void setPrice(double price) {
        super.setPrice(FRESH_PRICE);
    }
}
