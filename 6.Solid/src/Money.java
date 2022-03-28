public class Money {
    private int amount;
    private String currencyCode;

    public Money(int amount, String currency) {
        this.amount = amount;
        this.currencyCode = currency;
    }

    @Override
    public int hashCode() {
        return amount + currencyCode.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Money)) {
            return false;
        }
        Money other = (Money) obj;
        boolean currencyCodeEquals = (this.currencyCode == null && other.currencyCode == null)
                || (this.currencyCode != null && this.currencyCode.equals(other.currencyCode));
        return this.amount == other.amount && currencyCodeEquals;
    }


}
