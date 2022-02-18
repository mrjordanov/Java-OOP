package vegetagles;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Animal> animals = new ArrayList<>();

        String line = scanner.nextLine();

        while (!line.equals("End")) {
            String[] input = line.split("\\s+");
            Animal animal = createAnimal(input);
            animals.add(animal);
            String foodInput = scanner.nextLine();
            Food food = getFood(foodInput.split(" "));

            animal.makeSound();
            try {
                animal.eatFood(food);
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }

            line = scanner.nextLine();
        }
        animals.forEach(System.out::println);

    }

    public static Food getFood(String[] tokens) {
        String type = tokens[0];
        int quantity = Integer.parseInt(tokens[1]);

        if (type.equals("Meal")) {
            return new Meat(quantity);
        } else return new Vegetable(quantity);
    }

    public static Animal createAnimal(String[] input) {

        String animalType = input[0];
        String animalName = input[1];
        double weight = Double.parseDouble(input[2]);
        String region = input[3];

        switch (animalType) {
            case "Mouse":
                return new Mouse(animalName, animalType, weight, region);
            case "Cat":
                String breed = input[4];
                return new Cat(animalName, animalType, weight, region, breed);
            case "Zebra":
                return new Zebra(animalName, animalType, weight, region);
            case "Tiger":
                return new Tiger(animalName, animalType, weight, region);
            default:
                throw new IllegalArgumentException("No such animal");
        }
    }

}
