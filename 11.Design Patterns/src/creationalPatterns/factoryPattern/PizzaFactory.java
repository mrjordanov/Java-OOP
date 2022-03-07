package creationalPatterns.factoryPattern;

public class PizzaFactory {

    public Pizza createPizza(String pizzaType) {
        Pizza pizza = null;

        switch (pizzaType) {
            case "Bulgarian":
                pizza = new BulgarianPizza(50);
                break;
            case "Italian":
                pizza = new ItalianPizza(25);
                break;

        }

        return pizza;
    }
}
