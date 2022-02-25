import java.util.Scanner;

public class RangePrinter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            int start = Integer.parseInt(scanner.nextLine());
            int end = Integer.parseInt(scanner.nextLine());

            printNumber(start, end);
        } catch (NumberFormatException exception) {
            System.out.print("Invalid number");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

    }

    private static void printNumber(int start, int end) {

        if (start > 1 && start < end && end < 100) {
            for (int i = start; i <= end; i++) {
                System.out.print(i + " ");
            }
        } else throw new IllegalArgumentException("The entered numbers must be in this way 1<start<end<100");
    }

}

