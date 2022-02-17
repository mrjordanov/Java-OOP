package shapes;

public class Main {
    public static void main(String[] args) {

        try {
            Shape rectangle = new Rectangle(-5.00, 10.00);
            Shape circle = new Circle(5.00);
            System.out.println(rectangle.calculateArea());
            System.out.println(rectangle.calculatePerimeter());
            System.out.println(circle.calculateArea());
            System.out.println(circle.calculatePerimeter());

        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

    }
}
