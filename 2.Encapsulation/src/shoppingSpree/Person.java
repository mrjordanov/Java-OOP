package shoppingSpree;

import java.util.LinkedList;
import java.util.List;

public class Person {
    private String name;
    private double money;
    private List<Product> products;

    public Person(String name, double money) {
        this.setName(name);
        this.setMoney(money);
        this.products = new LinkedList<>();
    }

    private void setName(String name) {
        if (name.trim().isEmpty()) {
            throw new IllegalArgumentException("Name cannot be empty");
        }
        this.name = name;
    }

    private void setMoney(double money) {
        if (money < 0) {
            throw new IllegalArgumentException("Money cannot be negative");
        }
        this.money = money;
    }

    public String getName() {
        return name;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void buyProduct(Product product) {
        if (this.money < product.getCost()) {
            throw new IllegalArgumentException(this.name + " can`t afford " + product.getName());
        }
        this.products.add(product);
        this.money -= product.getCost();
        System.out.println(this.name + " bought " + product.getName());
    }

}



