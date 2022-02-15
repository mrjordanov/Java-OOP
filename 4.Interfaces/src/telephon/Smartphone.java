package telephon;

import java.util.List;

public class Smartphone implements Callable, Browsable {

    private List<String> numbers;
    private List<String> urls;

    public Smartphone(List<String> numbers, List<String> urls) {
        this.numbers = numbers;
        this.urls = urls;
    }


    @Override
    public String browse() {
       /* StringBuilder sb = new StringBuilder();
        for (String url : urls) {
            if (url.chars().noneMatch(Character::isDigit)) {
                sb.append("Browsing: ").append(url).append("!").append("\n");
            } else {
                sb.append("Invalid URL!").append("\n");
            }
        }*/
        String output = "";
        urls.forEach(e -> {
            String last = output;
            if (e.chars().noneMatch(Character::isDigit)) {
                last += "Browsing: " + e + "!\n";
                System.out.println("Browsing: " + e + "!");
            } else {
                last += "Invalid URL!\n";
                System.out.println("Invalid URL!");
            }
        });
        return output;
    }

    @Override
    public String call() {
        StringBuilder sb = new StringBuilder();
        for (String number : numbers) {
            if (number.matches("[0-9]+")) {
                sb.append("Calling... ").append(number).append("\n");
            } else {
                sb.append("Invalid number!").append("\n");
            }
        }
        return sb.toString();
    }

}
