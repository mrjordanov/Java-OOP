package HotelReservation;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] array = (scanner.nextLine().split("\\s+"));
        double pricePerDay = Double.parseDouble(array[0]);
        int numberOfDays = Integer.parseInt(array[1]);
        String season = array[2];
        String discountType = array[3];

        double price = PriceCalculator.calculatePrice(pricePerDay, numberOfDays, Season.valueOf(season), Discount.valueOf(discountType));
        System.out.printf("%.2f", price);
    }

}
