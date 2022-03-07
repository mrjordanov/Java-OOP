package restaurant.entities.healthyFoods;

public class Salad extends Food {

    private final double INITIAL_SALAD_PORTION = 150;

    public Salad(String name, double portion, double price) {
        super(name, portion, price);
    }

    @Override
    public void setPortion(double portion) {
        super.setPortion(INITIAL_SALAD_PORTION);
    }
}
