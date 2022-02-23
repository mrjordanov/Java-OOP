package reflection;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class HighQuality {
    public static void main(String[] args) {

        Class<Reflection> clazz = Reflection.class;
        Field[] declaredFields = clazz.getDeclaredFields();

        for (Field field : declaredFields) {
            System.out.println(Modifier.toString(field.getModifiers()));
        }

        Arrays.stream(clazz.getDeclaredFields()).filter(f -> !Modifier.isPrivate(f.getModifiers()))
                .sorted(Comparator.comparing(Field::getName))
                .forEach(f -> System.out.println(f.getName() + " must be private!"));

        Method[] declaredMethods = Arrays.stream(clazz.getDeclaredMethods()).filter(m -> !m.getName().equals("toString")).toArray(Method[]::new);

        Arrays.stream(declaredMethods).filter(m -> m.getReturnType() != void.class)
                .filter(m -> !Modifier.isPublic(m.getModifiers()))
                .sorted(Comparator.comparing(Method::getName))
                .forEach(f -> System.out.println(f.getName() + " have to be public!"));


        Arrays.stream(declaredMethods).filter(m -> m.getReturnType() == void.class)
                .filter(m -> !Modifier.isPrivate(m.getModifiers()))
                .sorted(Comparator.comparing(Method::getName))
                .forEach(f -> System.out.println(f.getName() + " have to be private!"));


        List<Author> annotated = Arrays.stream(clazz.getDeclaredMethods())
                .filter(m -> m.getAnnotation(Author.class) != null)
                .map(m -> m.getAnnotation(Author.class))
                .collect(Collectors.toList());

        annotated.forEach(a -> System.out.println("Method author is " + a.name()));

    }
}
