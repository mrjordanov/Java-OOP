package vechicle;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] info = scanner.nextLine().split("\\s+");

        Travel car = getTravel(info);
        info = scanner.nextLine().split("\\s+");
        Travel truck = getTravel(info);
        info = scanner.nextLine().split("\\s+");
        Travel bus = getTravel(info);

        int n = Integer.parseInt(scanner.nextLine());

        Map<String, Travel> vehicles = new LinkedHashMap<>();
        vehicles.put("Car", car);
        vehicles.put("Truck", truck);
        vehicles.put("Bus", bus);

        for (int i = 0; i < n; i++) {
            String[] parts = scanner.nextLine().split("\\s+");
            String vehicleType = parts[1];
            Travel vehicle = vehicles.get(vehicleType);
            if (parts[0].equals("Drive")) {
                double distance = Double.parseDouble(parts[2]);
                if (vehicle instanceof Bus) {
                    ((Bus) vehicle).setEmpty(false);
                }
                System.out.println(vehicle.drive(distance));
            }
            if (parts[0].equals("DriveEmpty")) {
                double distance = Double.parseDouble(parts[2]);
                if (vehicle instanceof Bus) {
                    ((Bus) vehicle).setEmpty(true);
                }
                System.out.println(vehicle.drive(distance));
            }

            if (parts[0].equals("Refuel")) {
                double refuel = Double.parseDouble(parts[2]);
                try {
                    vehicles.get(vehicleType).refuel(refuel);
                } catch (IllegalArgumentException e) {
                    System.out.println(e.getMessage());
                }
            }
        }

        vehicles.get("Car").getInformation();
        vehicles.get("Truck").getInformation();
        vehicles.get("Bus").getInformation();
    }


    private static Travel getTravel(String[] info) {
        String vehicleType = info[0];
        double quantity = Double.parseDouble(info[1]);
        double consumption = Double.parseDouble(info[2]);
        int capacity = Integer.parseInt(info[3]);
        Travel travel = null;
        if (vehicleType.equals("Car")) {
            travel = new Car(quantity, consumption, capacity);
        }
        if (vehicleType.equals("Bus")) {
            travel = new Bus(quantity, consumption, capacity);
        }
        if (vehicleType.equals("Truck")) {
            travel = new Truck(quantity, consumption, capacity);
        }
        return travel;
    }
}
