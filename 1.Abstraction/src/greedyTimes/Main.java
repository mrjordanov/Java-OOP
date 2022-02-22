
package greedyTimes;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        long bagCapacity = Long.parseLong(scanner.nextLine());
        String[] items = scanner.nextLine().split("\\s+");

        Map<String, LinkedHashMap<String, Long>> bagContent = new LinkedHashMap<>();

        long goldAmount = 0;
        long gemAmount = 0;
        long cashAmount = 0;

        for (int i = 0; i < items.length; i += 2) {
            String typeOfItem = items[i];
            long amount = Long.parseLong(items[i + 1]);

            String curItem = "";

            curItem = getItem(typeOfItem, curItem);


            if (curItem.equals("")) {
                continue;
            } else if (bagCapacity < bagContent.values().stream().map(Map::values).flatMap(Collection::stream).mapToLong(e -> e).sum() + amount) {
                continue;
            }

            if (isAmountOfCurItemMoreThanBagCapacity(bagContent, amount, curItem)) {
                continue;
            }

            if (!bagContent.containsKey(curItem)) {
                bagContent.put((curItem), new LinkedHashMap<>());
            }

            if (!bagContent.get(curItem).containsKey(typeOfItem)) {
                bagContent.get(curItem).put(typeOfItem, 0L);
            }

            bagContent.get(curItem).put(typeOfItem, bagContent.get(curItem).get(typeOfItem) + amount);
            if (curItem.equals("Gold")) {
                goldAmount += amount;
            } else if (curItem.equals("Gem")) {
                gemAmount += amount;
            } else if (curItem.equals("Cash")) {
                cashAmount += amount;
            }
        }

        for (Map.Entry<String, LinkedHashMap<String, Long>> entry : bagContent.entrySet()) {
            Long sumValues = entry.getValue().values().stream().mapToLong(l -> l).sum();

            System.out.printf("<%s> $%s%n", entry.getKey(), sumValues);

            entry.getValue().entrySet().stream().sorted((e1, e2) -> e2.getKey().compareTo(e1.getKey())).forEach(i -> System.out.println("##" + i.getKey() + " - " + i.getValue()));

        }
    }

    private static boolean isAmountOfCurItemMoreThanBagCapacity(Map<String, LinkedHashMap<String, Long>> bagContent, long amount, String curItem) {

        if ("Gem".equals(curItem)) {
            if (!bagContent.containsKey(curItem)) {
                if (bagContent.containsKey("Gold")) {
                    return amount > bagContent.get("Gold").values().stream().mapToLong(e -> e).sum();
                } else {
                    return true;
                }
            } else
                return bagContent.get(curItem).values().stream().mapToLong(e -> e).sum() + amount > bagContent.get("Gold").values().stream().mapToLong(e -> e).sum();
        } else if ("Cash".equals(curItem)) {
            if (!bagContent.containsKey(curItem)) {
                if (bagContent.containsKey("Gem")) {
                    return amount > bagContent.get("Gold").values().stream().mapToLong(e -> e).sum();
                } else {
                    return true;
                }
            } else
                return bagContent.get(curItem).values().stream().mapToLong(e -> e).sum() + amount > bagContent.get("Gem").values().stream().mapToLong(e -> e).sum();
        }
        return false;
    }


    private static String getItem(String typeOfItem, String curItem) {
        if (typeOfItem.length() == 3) {
            curItem = "Cash";
        }
        if (typeOfItem.toLowerCase().endsWith("gem")) {
            curItem = "Gem";
        }
        if (typeOfItem.equalsIgnoreCase("gold")) {
            curItem = "Gold";
        }
        return curItem;
    }
}