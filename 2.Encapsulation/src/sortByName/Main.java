package sortByName;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());

        List<Person> people = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String[] input = reader.readLine().split(" ");
            people.add(new Person(input[0], input[1], Integer.parseInt(input[2])));
        }

        people.sort((p1, p2) -> {
            int result = p1.getFirstName().compareTo(p2.getFirstName());
            if (result == 0) {
                result = Integer.compare(p1.getAge(), p2.getAge());
            }
            return result;
        });


        for (Person person : people) {
            System.out.println(person.toString());
        }

    }
}
