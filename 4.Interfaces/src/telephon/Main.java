package telephon;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> numbers = Arrays.stream(scanner.nextLine().split("\\s+")).collect(Collectors.toList());
        List<String> sites = Arrays.stream(scanner.nextLine().split("\\s+")).collect(Collectors.toList());

        Callable callable = new Smartphone(numbers, sites);
        Browsable browsable = new Smartphone(numbers, sites);

        System.out.print(callable.call());
        System.out.print(browsable.browse());

    }
}
