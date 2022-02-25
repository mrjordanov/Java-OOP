import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {

        testTryFinally();
    }

    public static void testTryFinally() {
        System.out.println("Code executed before try-finally.");

        try {
            String str = new Scanner(System.in).nextLine();
            Integer.parseInt(str);

            System.out.println("Parsing was successful.");
            return; // Exit from the current method
        } catch (NumberFormatException ex) {
            System.out.println("Parsing failed!");
        } finally {
            System.out.println("Finally block code executed.");
        }

        System.out.println("This code is after the try-finally block.");
    }

}