package pizzacalories;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);




        try {
            String[] arg = scanner.nextLine().split(" ");
            String pizzaName = arg[1];
            int numberOfToppings = Integer.parseInt(arg[2]);

            Pizza pizza = new Pizza(pizzaName, numberOfToppings);

            String[] tokens = scanner.nextLine().split("\\s+");
            String flourType = tokens[1];
            String bakingTechnique = tokens[2];
            double weight = Double.parseDouble(tokens[3]);

            Dough dough = new Dough(flourType, bakingTechnique, weight);

            pizza.setDough(dough);

            String input = scanner.nextLine();

            while (!input.equals("END")) {
                String[] command = input.split("\\s+");
                String toppingType = command[1];
                double weightOfTopping = Double.parseDouble(command[2]);
                Topping topping = new Topping(toppingType, weightOfTopping);
                pizza.addTopping(topping);

                input= scanner.nextLine();
            }

            System.out.println(pizza);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

    }
}
