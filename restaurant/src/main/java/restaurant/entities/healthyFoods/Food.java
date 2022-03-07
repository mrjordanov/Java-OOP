package restaurant.entities.healthyFoods;

import restaurant.entities.healthyFoods.interfaces.HealthyFood;

public abstract class Food implements HealthyFood {
    private String name;
    private double portion;
    private double price;


    protected Food(String name, double portion, double price) {
        this.setName(name);
        this.setPortion(portion);
        this.setPrice(price);
    }

    public void setName(String name) {
        if (isNullOrEmpty(name)) {
            throw new IllegalArgumentException("Name cannot be null or white space!");
        }
        this.name = name;
    }

    public void setPortion(double portion) {
        if (isValidValue(portion)) {
            throw new IllegalArgumentException("Portion cannot be less or equal to zero!");
        }
        this.portion = portion;
    }

    public void setPrice(double price) {
        if (isValidValue(price)) {
            throw new IllegalArgumentException("Price cannot be less or equal to zero!");
        }
        this.price = price;
    }

    private boolean isNullOrEmpty(String str) {
        return str == null || str.trim().isEmpty();
    }

    private boolean isValidValue(double value) {
        return value <= 0;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getPortion() {
        return portion;
    }

    @Override
    public double getPrice() {
        return price;
    }


}
