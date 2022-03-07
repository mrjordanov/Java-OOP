package behavioralPatterns.stategyPattern;

public class Main {
    public static void main(String[] args) {

        Bird seagull = new Bird(new CantFly());
        seagull.fly();

        seagull.setFlyStrategy(new FlyHigh());
        seagull.fly();

    }
}
