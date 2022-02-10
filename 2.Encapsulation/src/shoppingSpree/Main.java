package shoppingSpree;

import java.util.*;
import java.util.stream.Collectors;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        Map<String, Person> personMap = new LinkedHashMap<>();

        String line = scanner.nextLine();
        String[] inputForCustomers = line.split(";");

        for (String inputForCustomer : inputForCustomers) {

            String[] buyer = inputForCustomer.split("=");
            String buyerName = buyer[0];
            double money = Double.parseDouble(buyer[1]);
            try {
                Person person = new Person(buyerName, money);
                personMap.put(buyerName, person);

            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
                return;
            }
        }

        Map<String, Product> productsMap = new LinkedHashMap<>();
        String lineForProducts = scanner.nextLine();
        String[] inputForProducts = lineForProducts.split(";");

        for (String inputForProduct : inputForProducts) {

            String[] products = inputForProduct.split("=");
            String productName = products[0];
            double cost = Double.parseDouble(products[1]);
            try {
                Product product = new Product(productName, cost);
                productsMap.put(productName, product);
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
                return;
            }
        }

        String command = scanner.nextLine();
        while (!command.equals("END")) {

            String nameOfCustomer = command.split("\\s+")[0];
            String product = command.split("\\s+")[1];

            try {
                personMap.get(nameOfCustomer).buyProduct(productsMap.get(product));
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
            command = scanner.nextLine();
        }

        for (Map.Entry<String, Person> entry : personMap.entrySet()) {

            System.out.print(entry.getKey() + " - ");
            String collect = entry.getValue().getProducts().stream().map(Product::getName).collect(Collectors.joining(", "));
            if (collect.isEmpty()) {
                System.out.println("Nothing bought");
            } else {
                System.out.println(collect);
            }
        }

    }
}
