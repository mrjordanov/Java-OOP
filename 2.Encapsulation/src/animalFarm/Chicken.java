package animalFarm;

public class Chicken {
    private String name;
    private int age;

    public Chicken(String name, int age) {
        this.setName(name);
        this.setAge(age);
    }

    private void setName(String name) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Name cannot be empty.");
        }
        this.name = name;
    }

    private void setAge(int age) {
        if (age > 15 || age < 0) {
            throw new IllegalArgumentException("Age should be between 0 and 15.");
        }
        this.age = age;
    }

    private double calculateProductPerDay() {
        double production = 0.75;
        if (this.age <= 5) {
            production = 2.00;
        } else if (this.age <= 11) {
            production = 1.00;
        }
        return production;
    }

    private double productPerDay() {
        return calculateProductPerDay();
    }

    @Override
    public String toString() {
        return "Chicken " + name + " (age " + age + ") can produce "
                + String.format("%.2f", this.productPerDay()) + " eggs per day.";
    }
}
