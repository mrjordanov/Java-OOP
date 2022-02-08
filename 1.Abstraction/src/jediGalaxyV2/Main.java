package jediGalaxyV2;

import jediGalaxy.Field;
import jediGalaxy.Galaxy;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] dimensions = readPosition(scanner.nextLine());
        int rows = dimensions[0];
        int cols = dimensions[1];

        Field field= new Field(rows,cols);
       // Galaxy galaxy= new Galaxy(field);

        String command = scanner.nextLine();
        long starsCollected = 0;
        while (!command.equals("Let the Force be with you")) {
            int[] jediPosition = readPosition(command);
            int[] evilPosition = readPosition(scanner.nextLine());

            int rowEvil = evilPosition[0];
            int colEvil = evilPosition[1];
            field.moveEvil(rowEvil,colEvil);

            int rowJedi = jediPosition[0];
            int colJedi = jediPosition[1];

            starsCollected= field.moveJedi(rowJedi,colJedi);

            command = scanner.nextLine();
        }

        System.out.print(starsCollected);

    }

    private static int[] readPosition(String command) {
        return Arrays.stream(command.split(" ")).mapToInt(Integer::parseInt).toArray();
    }

}
