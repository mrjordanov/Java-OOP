package pizzacalories;

import java.util.ArrayList;
import java.util.List;

public class Pizza {

    private String name;
    private Dough dough;
    private List<Topping> toppings;
    private int numberOfTopping;


    public Pizza(String name, int numberOfTopping) {
        this.setName(name);
        this.setNumberOfTopping(numberOfTopping);
        this.toppings = new ArrayList<>();
    }

    private void setName(String name) {
        if (isValid(name) || name.length() > 15) {
            throw new IllegalArgumentException("Pizza name should be between 1 and 15 symbols.");
        }
        this.name = name;
    }

    private boolean isValid(String name) {
        return name == null || name.trim().isEmpty();
    }

    private void setNumberOfTopping(int numberOfTopping) {
        if (numberOfTopping < 0 | numberOfTopping > 10) {
            throw new IllegalArgumentException("Number of toppings should be in range [0..10].");
        }
        this.numberOfTopping = numberOfTopping;
    }

    public void setDough(Dough dough) {
        this.dough = dough;
    }

    public String getName() {
        return name;
    }

    public void addTopping(Topping topping) {
        if(toppings.size()<numberOfTopping){
            this.toppings.add(topping);
        }
    }

    public double getOverallCalories() {
        return dough.calculateCalories() + toppings.stream().map(Topping::calculateCalories).mapToDouble(Double::doubleValue).sum();
    }

    @Override
    public String toString() {
        String format = String.format("%s - %.2f", this.name, this.getOverallCalories());
        return format;
    }
}
