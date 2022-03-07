package restaurant.entities.tables;


import restaurant.entities.drinks.interfaces.Beverages;
import restaurant.entities.healthyFoods.interfaces.HealthyFood;


import java.util.LinkedList;
import java.util.List;


public abstract class BaseTable implements Table {

    private List<HealthyFood> healthyFood;
    private List<Beverages> beverages;
    private int number;
    private int size;
    private int numberOfPeople;
    private double pricePerPerson;
    private boolean isReservedTable;


    protected BaseTable(int number, int size, double pricePerPerson) {
        this.number = number;
        this.setSize(size);
        this.pricePerPerson = pricePerPerson;
        this.healthyFood = new LinkedList<>();
        this.beverages = new LinkedList<>();
        this.isReservedTable = true;

    }


    public double getAllPeople() {
        return pricePerPerson * numberOfPeople;
    }

    @Override
    public boolean isReservedTable() {
        return isReservedTable;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        if (size <= 0) {
            throw new IllegalArgumentException("Size has to be greater than 0!");
        }
        this.size = size;
    }

    public double getPricePerPerson() {
        return pricePerPerson;
    }

    public void setPricePerPerson(double pricePerPerson) {
        this.pricePerPerson = pricePerPerson;
    }


    public int getNumberOfPeople() {
        return numberOfPeople;
    }

    public void setNumberOfPeople(int numberOfPeople) {
        if (numberOfPeople <= 0) {
            throw new IllegalArgumentException("Cannot place zero or less people!");
        }
        this.numberOfPeople = numberOfPeople;
    }

    @Override
    public void reserve(int numberOfPeople) {
        this.numberOfPeople = numberOfPeople;
    }

    @Override
    public void orderHealthy(HealthyFood food) {
        this.healthyFood.add(food);
    }

    @Override
    public void orderBeverages(Beverages beverages) {
        this.beverages.add(beverages);
    }

    @Override
    public double bill() {
        double priceForHealthyOrders = healthyFood.stream().mapToDouble(HealthyFood::getPrice).sum();
        double priceForBeveragesOrders = beverages.stream().mapToDouble(Beverages::getPrice).sum();
        return priceForHealthyOrders + priceForBeveragesOrders;
    }


    @Override
    public void clear() {
        this.healthyFood.clear();
        this.beverages.clear();
        this.isReservedTable = false;
        this.numberOfPeople = 0;
        this.pricePerPerson = 0;
    }


    @Override
    public String tableInformation() {
        StringBuilder sb = new StringBuilder();
        sb.append("Table - ").append(number).append("\n");
        sb.append("Size - ").append(size).append("\n");

        return sb.toString();
    }
}
