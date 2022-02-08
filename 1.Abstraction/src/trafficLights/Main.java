package trafficLights;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Color[] signal = Arrays.stream(scanner.nextLine().split(" "))
                .map(e -> Color.valueOf(e)).toArray(Color[]::new);

        List<TrafficLight> trafficLights = new ArrayList<>();

        for (Color color : signal) {
            TrafficLight trafficLight = new TrafficLight(color);
            trafficLights.add(trafficLight);
        }

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            for (TrafficLight light : trafficLights) {
                light.changeColor();
                System.out.print(light.getColor() + " ");
            }
            System.out.println();
        }
    }
}

