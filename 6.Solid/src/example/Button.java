package example;

public class Button {
    private Device device;
    private static int counterForPushes = 0;


    public Button(Device device) {
        this.device = device;
    }

    public void pushTheButton() {
        counterForPushes++;
        if (counterForPushes % 2 != 0) {
            device.turnOn();
        } else {
            device.turnOff();
        }
    }
}
