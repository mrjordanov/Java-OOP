package vechicle;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] info = scanner.nextLine().split("\\s+");

        double quantity = Double.parseDouble(info[1]);
        double consumption = Double.parseDouble(info[2]);

        Travel car = new Car(quantity, consumption);

        String[] arg = scanner.nextLine().split("\\s+");

        double quantityTruck = Double.parseDouble(arg[1]);
        double consumptionTruck = Double.parseDouble(arg[2]);

        Travel truck = new Truck(quantityTruck, consumptionTruck);
        int n = Integer.parseInt(scanner.nextLine());

        Map<String, Travel> vehicles = new LinkedHashMap<>();
        vehicles.put("Car", car);
        vehicles.put("Truck", truck);


        for (int i = 0; i < n; i++) {
            String[] parts = scanner.nextLine().split("\\s+");
            String vehicleType = parts[1];
            if (parts[0].equals("Drive")) {
                double distance = Double.parseDouble(parts[2]);
                System.out.println(vehicles.get(vehicleType).drive(distance));
            }
            if (parts[0].equals("Refuel")) {
                double refuel = Double.parseDouble(parts[2]);
                vehicles.get(vehicleType).refuel(refuel);
            }
        }

        vehicles.get("Car").getInformation();
        vehicles.get("Truck").getInformation();
    }
}
