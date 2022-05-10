package behavioralPatterns.stategyPattern;

public class Main {
    public static void main(String[] args) {
        FlyStrategy flyStrategy= new CantFly();
        Bird seagull = new Bird(flyStrategy);
        seagull.fly();

        seagull.setFlyStrategy(new FlyHigh());
        seagull.fly();

    }
}
