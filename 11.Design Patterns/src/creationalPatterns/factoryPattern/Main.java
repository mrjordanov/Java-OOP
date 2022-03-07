package creationalPatterns.factoryPattern;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String pizzaType = scanner.nextLine();
        PizzaFactory pizzaFactory = new PizzaFactory();
        Pizza pizza = pizzaFactory.createPizza(pizzaType);
        pizza.bake();
        pizza.prepare();
        pizza.box();

    }
}
