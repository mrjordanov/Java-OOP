package pizzacalories;

public class Topping {

    private double TOPPING_MODIFIER;
    private final int INITIAL_CALORIES_PER_GRAM = 2;

    private String toppingType;
    private double weight;

    public Topping(String toppingType, double weight) {
        this.setToppingType(toppingType);
        this.setWeight(weight);
    }

    private void setToppingType(String toppingType) {
        if (toppingType.equals("Meat")) {
            TOPPING_MODIFIER = 1.2;
        } else if (toppingType.equals("Veggies")) {
            TOPPING_MODIFIER = 0.8;
        } else if (toppingType.equals("Cheese")) {
            TOPPING_MODIFIER = 1.1;
        } else if (toppingType.equals("Sauce")) {
            TOPPING_MODIFIER = 0.9;
        } else {
            throw new IllegalArgumentException("Cannot place " + toppingType + " on top of your pizza.");
        }
        this.toppingType = toppingType;
    }

    public String getToppingType() {
        return toppingType;
    }

    public double getWeight() {
        return weight;
    }

    private void setWeight(double weight) {
        if (weight < 1 | weight > 50) {
            throw new IllegalArgumentException(this.getToppingType() + " weight should be in the range [1..50].");
        }
        this.weight = weight;
    }

    public double calculateCalories() {
        return INITIAL_CALORIES_PER_GRAM * weight * TOPPING_MODIFIER;
    }
}
