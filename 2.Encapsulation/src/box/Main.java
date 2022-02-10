package box;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        double length = Double.parseDouble(scanner.nextLine());
        double width = Double.parseDouble(scanner.nextLine());
        double height = Double.parseDouble(scanner.nextLine());

        try {
            Box box = new Box(length, width, height);
            printCalculations(box.calculateSurfaceArea(), "Surface Area");
            printCalculations(box.calculateLateralSurfaceArea(), "Lateral Surface Area");
            printCalculations(box.calculateVolume(), "Volume");

        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

    }

    private static void printCalculations(double box, String pattern) {
        System.out.printf(pattern + " - %.2f", box).println();
    }

}
