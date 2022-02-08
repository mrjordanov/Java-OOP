package cardSuit;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Card Suits:");
        for (Cards card : Cards.values()) {
            System.out.printf("Ordinal value: %d; Name value: %s", card.ordinal(), card.name()).println();
        }

       /* Cards[] values = Cards.values();
        System.out.println("Hi");*/
    }
}

