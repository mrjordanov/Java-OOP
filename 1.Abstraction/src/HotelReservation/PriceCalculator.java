package HotelReservation;

public class PriceCalculator {
    public static double calculatePrice(double pricePerDay, int numberOfDays, Season season, Discount discount) {
        int multiplayer = season.getValue();
        double discountMultiplier = discount.getValue() / 100.00;
        double priceBeforeDiscount = numberOfDays * pricePerDay * multiplayer;
        double discountedAmount = priceBeforeDiscount * discountMultiplier;
        return priceBeforeDiscount - discountedAmount;
    }
}
