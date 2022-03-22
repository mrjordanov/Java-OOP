package example;

public class Radio implements Device {

    public Radio() {
    }

    @Override
    public void turnOn() {
        System.out.println("The Radio is On");
    }

    @Override
    public void turnOff() {
        System.out.println("The Radio is Off");
    }
}
