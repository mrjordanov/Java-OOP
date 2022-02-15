package collection;


import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = (scanner.nextLine().split("\\s+"));
        int numberOfRemoveOperations = Integer.parseInt(scanner.nextLine());

        Addable addCollection = new AddCollection();
        AddRemovable addableAndRemovable = new AddRemoveCollection();
        MyList myListImpl = new MyListImpl();


        printAdd(input, addCollection);
        printAdd(input, addableAndRemovable);
        printAdd(input, myListImpl);

        printRemove(numberOfRemoveOperations, addableAndRemovable);
        printRemove(numberOfRemoveOperations, myListImpl);
    }

    private static void printAdd(String[] input, Addable collection) {
        for (String text : input) {
            System.out.print(collection.add(text) + " ");
        }
        System.out.println();
    }

    private static void printRemove(int numberOfRemoveOperations, AddRemovable collection) {
        for (int i = 0; i < numberOfRemoveOperations; i++) {
            System.out.print(collection.remove() + " ");
        }
        System.out.println();

    }
}
