package creationalPatterns.builderPattern.exampleOne;

public class Main {
    public static void main(String[] args) {
        Pizza pizza = new Pizza().withWeight(500).withTopping("dfgdf").withName("Margherita");
        System.out.println(pizza);

    }
}
