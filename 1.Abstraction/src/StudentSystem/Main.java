package StudentSystem;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        StudentSystem studentRepository = new StudentSystem();

        while (true) {
            String[] input = scanner.nextLine().split(" ");

            if (input[0].equals("Exit")) {
                break;
            }
            if (input[0].equals("Create")) {
                studentRepository.createStudentInRepository(input);
            }
            if (input[0].equals("Show")) {
                studentRepository.getInfoAboutStudent(input);
            }
        }

    }
}
