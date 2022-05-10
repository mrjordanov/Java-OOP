package behavioralPatterns.observerPattern;

public class Main {
    public static void main(String[] args) {
        Observer carEnthusiast1 = new CarEnthusiast();
        Observer carEnthusiast2 = new CarEnthusiast();
        Observer carEnthusiast3 = new CarEnthusiast();

        

        Subject carMagazine = new CarMagazine();
        carMagazine.subscribe(carEnthusiast1);
        carMagazine.subscribe(carEnthusiast2);
        carMagazine.subscribe(carEnthusiast3);


        carMagazine.notify("First");
    }
}
