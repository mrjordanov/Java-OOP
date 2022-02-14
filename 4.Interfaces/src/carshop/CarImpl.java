package carshop;

public class CarImpl implements Car {
    private String model;
    private String color;
    private Integer horsePower;
    private String countryOfProduce;

    public CarImpl(String model, String color, Integer horsePower, String countryOfProduce) {
        this.model = model;
        this.color = color;
        this.horsePower = horsePower;
        this.countryOfProduce = countryOfProduce;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public Integer getHorsePower() {
        return horsePower;
    }

    public String getCountryOfProduce() {
        return countryOfProduce;
    }

    @Override
    public String countryProduced() {
        return countryOfProduce;
    }

    @Override
    public String toString() {
        return "This is "+model+" produced in "+countryOfProduce+" and have "+Car.TIRES+" tires";

    }
}
