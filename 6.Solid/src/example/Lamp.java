package example;

public class Lamp implements  Device{


    public Lamp() {
    }

    @Override
    public void turnOn() {
        System.out.println("The lamp is On");
    }

    @Override
    public void turnOff() {
        System.out.println("The lamp is Off");

    }
}
