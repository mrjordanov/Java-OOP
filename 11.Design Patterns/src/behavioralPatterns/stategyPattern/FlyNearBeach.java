package behavioralPatterns.stategyPattern;

public class FlyNearBeach implements FlyStrategy {

    @Override
    public void fly() {
        System.out.println("I fly near the beach");
    }
}
