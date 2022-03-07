package behavioralPatterns.observerPattern;

import java.util.ArrayList;
import java.util.List;

public class CarMagazine implements Subject {

    private List<Observer> observers;


    public CarMagazine() {
        this.observers = new ArrayList<>();
    }

    @Override
    public void subscribe(Observer observer) {
        this.observers.add(observer);
    }

    @Override
    public void unSubscribe(Observer observer) {
        this.observers.remove(observer);
    }

    @Override
    public void notify(String text) {
        observers.forEach(observer -> observer.update(text));
    }
}
