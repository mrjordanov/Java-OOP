package blackBoxInteger;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException, NoSuchFieldException {

        Scanner scanner = new Scanner(System.in);

        Class<BlackBoxInt> clazz = BlackBoxInt.class;

        Constructor<BlackBoxInt> constructor = clazz.getDeclaredConstructor();//вземаме празния конструктор;
        constructor.setAccessible(true); //сетваме достъпа на true тъй като е private;

        BlackBoxInt blackBoxInt = constructor.newInstance();//създава нова инстанция с този конструктор;

        Field field = clazz.getDeclaredField("innerValue");// взимаме полето с име "innerValue";
        field.setAccessible(true);// сетваме достъпа на true, тъй като в класа е private;


        String arg = scanner.nextLine();

        while (!arg.equals("END")) {
            String[] tokens = arg.split("_");
            String nameOfMethod = tokens[0];
            int value = Integer.parseInt(tokens[1]);

            Method method = clazz.getDeclaredMethod(nameOfMethod, int.class);//във скобите описвам сигнатурата на метода!
            // (име+ параметрите)
            method.setAccessible(true);
            method.invoke(blackBoxInt, value);//прилагам метода в/у обекта blackBoxInt, като аргумента е value;
            System.out.println(field.get(blackBoxInt));//за да get-na полето,
            // трябва да кажа за кой обект искам да го взема това поле

            arg = scanner.nextLine();
        }
    }
}

