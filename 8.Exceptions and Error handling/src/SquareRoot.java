import java.util.Scanner;

public class SquareRoot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            int number = Integer.parseInt(scanner.nextLine());
            System.out.println(number * number);
        } catch (NumberFormatException exception) {
            System.out.println("Invalid number");
        } finally {
            System.out.print("Good bye");
        }

    }
}
