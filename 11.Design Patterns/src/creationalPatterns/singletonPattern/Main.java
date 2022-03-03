package creationalPatterns.singletonPattern;

public class Main {
    public static void main(String[] args) {


        long start = System.currentTimeMillis();

        DbInstance instance = DbInstance.getInstance();
        instance.createTable();

        long end = System.currentTimeMillis();

        System.out.println(end - start);

        start = System.currentTimeMillis();

        DbInstance instanceTwo = DbInstance.getInstance();
        instanceTwo.createTable();

        end = System.currentTimeMillis();

        System.out.println(end - start);
    }
}
