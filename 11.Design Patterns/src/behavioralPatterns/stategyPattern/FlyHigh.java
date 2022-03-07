package behavioralPatterns.stategyPattern;

public class FlyHigh implements FlyStrategy {

    @Override
    public void fly() {
        System.out.println("I fly high in the skies");
    }
}
