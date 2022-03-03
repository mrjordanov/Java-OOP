package behavioralPatterns.commandPattern;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Lamp lampInKitchen = new Lamp();
        Lamp lampInBedRoom = new Lamp();
        Lamp lampInBathRoom = new Lamp();

        List<Lamp> lampList = new ArrayList<>();

        lampList.add(lampInKitchen);
        lampList.add(lampInBedRoom);
        lampList.add(lampInBathRoom);

        Switch invoker = new Switch();
        invoker.storeAndExecute(new TurnAllLampsOn(lampList));

        //  invoker.storeAndExecute(new commandPattern.LightOn(lampInKitchen));
        // invoker.storeAndExecute(new commandPattern.LightOff(lampInKitchen));

        invoker.undoExecuted();

    }
}
