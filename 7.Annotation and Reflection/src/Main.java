import demo.Dog;
import demo.Person;

public class Main {
    public static void main(String[] args) {

        Class<Dog> clazz = Dog.class;

        System.out.println(clazz.getSuperclass().getSimpleName());
        Class<?>[] interfaces = clazz.getInterfaces();


        Class<?> clazz1= Person.class;
        System.out.println(clazz1.getSuperclass().getSimpleName());
    }
}
