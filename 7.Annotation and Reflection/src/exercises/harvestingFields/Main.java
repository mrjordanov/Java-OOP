package exercises.harvestingFields;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Class<RichSoilLand> clazz = RichSoilLand.class;

        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();

        while (!command.equals("HARVEST")) {
            if (command.equals("private")) {
                printFields(command, clazz);
            }
            if (command.equals("protected")) {
                printFields(command, clazz);
            }
            if (command.equals("public")) {
                printFields(command, clazz);
            }
            if (command.equals("all")) {
                printFields(command, clazz);
            }
            command = scanner.nextLine();
        }

    }

    private static void printFields(String command, Class<?> clazz) {
        Field[] declaredFields = clazz.getDeclaredFields();
        if (!command.equals("all")) {
            Arrays.stream(declaredFields).filter(f -> Modifier.toString(f.getModifiers()).equals(command))
                    .forEach(f -> System.out.printf
                            ("%s %s %s", Modifier.toString(f.getModifiers()), f.getType().getSimpleName(), f.getName()).println());
        } else {
            Arrays.stream(declaredFields)
                    .forEach(f -> System.out.printf
                            ("%s %s %s", Modifier.toString(f.getModifiers()), f.getType().getSimpleName(), f.getName()).println());
        }
    }
}