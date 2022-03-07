package restaurant.entities.healthyFoods;

public class VeganBiscuits extends Food {

    private final double INITIAL_VEGAN_BISCUIT_PORTION = 205;

    protected VeganBiscuits(String name, double portion, double price) {
        super(name, portion, price);
    }

    @Override
    public void setPortion(double portion) {
        super.setPortion(INITIAL_VEGAN_BISCUIT_PORTION);
    }
}
