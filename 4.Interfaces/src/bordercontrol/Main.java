package bordercontrol;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String info = scanner.nextLine();

        List<Identifiable> identifiableList = new ArrayList<>();

        while (!info.equals("End")) {
            String[] tokens = info.split("\\s+");
            Identifiable identifiable = tokens.length == 2 ? new Robot(tokens[0], tokens[1])
                    : new Citizen(tokens[0], Integer.parseInt(tokens[1]), tokens[2]);
            identifiableList.add(identifiable);

            info = scanner.nextLine();
        }

        String fakeId = scanner.nextLine();
        identifiableList.stream().map(Identifiable::getId).filter(id -> id.endsWith(fakeId)).forEach(System.out::println);
    }
}
