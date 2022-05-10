package creationalPatterns.builderPattern.exampleTwo;

public class Main {
    public static void main(String[] args) {


        LunchOrder lunchOrder = LunchOrder.Builder
                .get()
                .withBread("Bread")
                .withSalad("Shopska")
                .withMeat("Pork")
                .build();



        System.out.println(lunchOrder);
    }
}
