package creationalPatterns.singletonPattern;

public class DbInstance {

    private static volatile DbInstance instance;

    private DbInstance() {

        //Тази проверка може да се добави ако някой с Reflection се опита да създаде нова инстанция
       /* if (instance != null) {
            throw new RuntimeException("To use DbInstance call getInstance()");
        }*/

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static DbInstance getInstance() {
        if (instance == null) {
            synchronized (DbInstance.class) {
                if (instance == null) {
                    instance = new DbInstance();
                }
            }
        }
        return instance;
    }

    public void createTable() {
        System.out.println("Something is done");
    }

}
