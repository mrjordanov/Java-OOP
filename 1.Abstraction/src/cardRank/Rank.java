package cardRank;

public enum Rank {
    CLUBS(0), DIAMONDS(13),
    HEARTS(26), SPADES(39);

    private int power;

    Rank(int power) {
        this.power = power;
    }

    public int getPower() {
        return power;
    }
}
