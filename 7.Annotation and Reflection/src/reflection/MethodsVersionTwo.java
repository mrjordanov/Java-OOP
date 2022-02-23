package reflection;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;


public class MethodsVersionTwo {

    public static void main(String[] args) {

        Class<Reflection> clazz = Reflection.class;

        List<Method> getMethods = new ArrayList<>();
        List<Method> setMethods = new ArrayList<>();

        Method[] declaredMethods = clazz.getDeclaredMethods();
        for (Method method : declaredMethods) {
            if (method.getName().startsWith("get")) {
                getMethods.add(method);
            } else if (method.getName().startsWith("set")) {
                setMethods.add(method);
            }
        }

        getMethods.stream().sorted(Comparator.comparing(Method::getName)).forEach(m -> System.out.printf("%s will return class %s", m.getName(), m.getReturnType().getSimpleName()).println());
        setMethods.stream().sorted(Comparator.comparing(Method::getName)).forEach(m -> System.out.printf("%s and will set field of class %s", m.getName(), m.getParameterTypes()[0].getSimpleName()).println());
    }
}