package cardRank;


public class Card {
    private Cards cardSuit;
    private Rank cardRank;

    public Card(Cards cardSuit, Rank cardRank) {
        this.cardSuit = cardSuit;
        this.cardRank = cardRank;
    }

    public int getPower() {
        return cardRank.getPower() + cardSuit.getValue();
    }
}
