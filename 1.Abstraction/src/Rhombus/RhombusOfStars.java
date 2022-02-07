package Rhombus;

import java.util.Scanner;

public class RhombusOfStars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        Rhombus rhombus= new Rhombus(n);
        System.out.print(rhombus.getFigure());
    }

}
