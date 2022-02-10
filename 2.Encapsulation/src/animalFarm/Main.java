package animalFarm;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            Chicken chicken = new Chicken(scanner.nextLine(), Integer.parseInt(scanner.nextLine()));
            System.out.print(chicken);
        } catch (IllegalArgumentException e) {
            System.out.print(e.getMessage());
        }
    }
}
