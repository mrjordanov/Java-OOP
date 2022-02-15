package food;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        Map<String, Buyer> buyerInfo = new LinkedHashMap<>();

        for (int i = 0; i < n; i++) {
            String line = scanner.nextLine();
            String[] arg = line.split("\\s+");

            Buyer buyer = arg.length == 4 ? new Citizen(arg[0], Integer.parseInt(arg[1]), arg[2], arg[3])
                    : new Rebel(arg[0], Integer.parseInt(arg[1]), arg[2]);
            buyer.buyFood();
            buyerInfo.put(arg[0], buyer);
        }

        String nameToCheck = scanner.nextLine();

        int totalFoodPurchased = 0;

        while (!nameToCheck.equals("End")) {

            if (!buyerInfo.isEmpty() && buyerInfo.containsKey(nameToCheck)) {
                totalFoodPurchased += buyerInfo.get(nameToCheck).getFood();
            }
            nameToCheck = scanner.nextLine();
        }

        System.out.println(totalFoodPurchased);

    }
}
