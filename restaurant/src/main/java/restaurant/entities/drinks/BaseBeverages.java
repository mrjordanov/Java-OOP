package restaurant.entities.drinks;

import restaurant.entities.drinks.interfaces.Beverages;

public abstract class BaseBeverages implements Beverages {

    private String name;
    private int counter;
    private double price;
    private String brand;

    protected BaseBeverages(String name, int counter, double price, String brand) {
        this.setName(name);
        this.setCounter(counter);
        this.setPrice(price);
        this.setBrand(brand);
    }


    @Override
    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (isNullOrEmpty(name)) {
            throw new IllegalArgumentException("Name cannot be null or white space!");
        }
        this.name = name;
    }

    @Override
    public int getCounter() {
        return counter;
    }

    public void setCounter(int counter) {
        if (counter <= 0) {
            throw new IllegalArgumentException("Counter cannot be less or equal to zero!");
        }
        this.counter = counter;
    }

    @Override
    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price <= 0) {
            throw new IllegalArgumentException("Price cannot be less or equal to zero!");
        }
        this.price = price;
    }

    @Override
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        if (isNullOrEmpty(brand)) {
            throw new IllegalArgumentException("Brand cannot be null or white space!");
        }
        this.brand = brand;
    }

    private boolean isNullOrEmpty(String str) {
        return str == null || str.trim().isEmpty();
    }

}
