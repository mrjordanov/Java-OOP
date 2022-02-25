import java.util.Scanner;

public class Fix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] weekdays = new String[5];

        weekdays[0] = "Monday";
        weekdays[1] = "2";
        weekdays[2] = "3";
        weekdays[3] = "4";
        weekdays[4] = "5";

        for (int i = 0; i <= weekdays.length; i++) {
            try {
                System.out.println(weekdays[i]);
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println(e.getMessage());
            }
        }

        scanner.nextLine();

    }
}
