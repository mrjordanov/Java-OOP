package person;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String info = scanner.nextLine();
        List<Birthable> list = new ArrayList<>();
        while (!info.equals("End")) {
            String[] tokens = info.split("\\s+");

            Birthable birthable = tokens.length == 5 ? new Citizen(tokens[1], Integer.parseInt(tokens[2]), tokens[3], tokens[4])
                    : new Pet(tokens[1], tokens[2]);
            list.add(birthable);

            info = scanner.nextLine();
        }

        String year = scanner.nextLine();
        list.stream().map(Birthable::getBirthDate).filter(e -> e.endsWith(year)).forEach(System.out::println);
        // list.stream().filter(e->e.getBirthDate().endsWith(year)).forEach(e-> System.out.println(e.getBirthDate()));
    }
}
