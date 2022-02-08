package jediGalaxy;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[][] matrixSize = getSizeOfMatrix(scanner);
        int[][] matrix = fillMatrix(matrixSize);


        String lineForPlayer = scanner.nextLine();
        int starsCollected = 0;
        while (!lineForPlayer.equals("Let the Force be with you")) {

            int[] playerCoordinates = getCoordinates(lineForPlayer);
            int playerRow = playerCoordinates[0];
            int playerCol = playerCoordinates[1];

            int[] evilCoordinates = getCoordinates(scanner.nextLine());
            int evilRow = evilCoordinates[0];
            int evilCol = evilCoordinates[1];

            while (evilRow >= 0 && evilCol >= 0) {
                if (isInBounds(evilRow, evilCol, matrix)) {
                    matrix[evilRow][evilCol] = 0;
                }
                evilRow--;
                evilCol--;
            }

            while (playerRow >= 0 && playerCol < matrix[1].length) {
                if (isInBounds(playerRow, playerCol, matrix)) {
                    starsCollected += matrix[playerRow][playerCol];
                }

                playerCol++;
                playerRow--;
            }

            lineForPlayer = scanner.nextLine();
        }

        System.out.print(starsCollected);
    }


    private static boolean isInBounds(int row, int col, int[][] matrix) {
        return row >= 0 && col >= 0 && row < matrix.length && col < matrix[row].length;
    }

    private static int[] getCoordinates(String line) {
        return Arrays.stream(line.split(" ")).mapToInt(Integer::parseInt).toArray();
    }

    private static int[][] getSizeOfMatrix(Scanner scanner) {
        int[] dimensionOfMatrix = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int rows = dimensionOfMatrix[0];
        int cols = dimensionOfMatrix[1];

        return new int[rows][cols];
    }

    private static int[][] fillMatrix(int[][] matrix) {
        int initialValue = 0;
        for (int row = 0; row < matrix.length; row++) {

            for (int col = 0; col < matrix[row].length; col++) {
                matrix[row][col] = initialValue++;
            }
        }

        return matrix;
    }
}
