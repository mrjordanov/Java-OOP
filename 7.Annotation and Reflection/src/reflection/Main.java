package reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Class<Reflection> clazz = Reflection.class;


        System.out.println(clazz.getSimpleName());
        System.out.println(clazz.getSuperclass().getSimpleName());

        try {
            Arrays.stream(clazz.getInterfaces()).forEach(c -> System.out.println(c.getSimpleName()));
            // Arrays.stream(clazz.getInterfaces()).map(Class::getSimpleName).forEach(System.out::println);

            Constructor<Reflection> ctor = clazz.getDeclaredConstructor();
            /*
            Constructor<Reflection> ctorWithParameters = clazz.getDeclaredConstructor(String.class, String.class, String.class);

            Parameter[] parameters = ctor.getParameters();
            Parameter[] parametersTwo = ctorWithParameters.getParameters();

            for (Parameter parameter : parameters) {
                System.out.println(parameter.getType().getSimpleName());
            }

            for (Parameter parameter : parametersTwo) {
                System.out.println(parameter.getType().getSimpleName());
            }


          /*  ctor.setAccessible(true);
            Ако конструктора на Reflection беше private нямаше да мога да създам инстанция от тип reflection,
            но ако изрично кажа, е setAccessible(true), тогава казвам, че ще имам достъп до private констр.
            и ще мога да създавам инстанции
            */

            Reflection reflection = ctor.newInstance();
            System.out.println(reflection);

            //   System.out.println(clazz.getDeclaredConstructor().newInstance());

            Field[] declaredFields = clazz.getDeclaredFields();

            Field nickNameStaticField = declaredFields[0];
            nickNameStaticField.setAccessible(true);

            nickNameStaticField.set(null, "Johny");

            Object nickNameValue = nickNameStaticField.get(null);

            System.out.println(nickNameValue);

            Field zipField = clazz.getDeclaredField("zip");
            System.out.println(zipField.getName());
            System.out.println(zipField.getType());

            zipField.setAccessible(true);

            zipField.set(reflection, 13);


            System.out.println("Zip field from instance getter " + reflection.getZip());


            int value = (int) zipField.get(reflection);

            System.out.println("Zip field with reflection " + value);


            Method[] declaredMethods = clazz.getDeclaredMethods();
            System.out.println(declaredMethods[7].getName());
            Method declaredMethod = declaredMethods[7];
            Object invoke = declaredMethod.invoke(reflection);
            System.out.println(invoke);

        } catch (Exception ex) {
            ex.printStackTrace();

        }

    }
}
