package cardRank;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String cardName = scanner.nextLine();
        String cardSuit = scanner.nextLine();

        // int result = getResult(cardName, cardSuit);
        Cards cards = Cards.valueOf(cardName);
        Rank rank = Rank.valueOf(cardSuit);
        Card card = new Card(cards, rank);

        System.out.printf("Card name: %s of %s; Card power: %d", cardName, cardSuit, card.getPower());

    }

   /* static int getResult(String cardName, String cardSuit) {
        return Cards.valueOf(cardName).getValue() + Rank.valueOf(cardSuit).getPower();
    }*/
}
