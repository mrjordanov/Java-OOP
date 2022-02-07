package PointInRecangle;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int[] coordinates = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        int bottomLeftX = coordinates[0];
        int bottomLeftY = coordinates[1];
        int topRightX = coordinates[2];
        int topRightY = coordinates[3];
        int n = Integer.parseInt(scanner.nextLine());

        Rectangle rectangle = new Rectangle(bottomLeftX, bottomLeftY, topRightX, topRightY);

        for (int i = 0; i < n; i++) {
            String line = scanner.nextLine();
            int[] pointToCheck = Arrays.stream(line.split("\\s+")).mapToInt(Integer::parseInt).toArray();
            int x = pointToCheck[0];
            int y = pointToCheck[1];

            Point point = new Point(x, y);
            System.out.println(rectangle.contains(point));

        }

    }


}
