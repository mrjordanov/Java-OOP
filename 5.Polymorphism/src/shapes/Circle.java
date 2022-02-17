package shapes;

public class Circle extends Shape {

    private Double radius;

    public Circle(Double radius) {
        this.setRadius(radius);
    }

    final Double getRadius() {
        return radius;
    }

    public void setRadius(Double radius) {
        if (radius > 0) {
            this.radius = radius;
        } else {
            throw new IllegalArgumentException("The radius can`t be zero ore negative");
        }
    }


    @Override
    public Double calculatePerimeter() {
        return  2 * radius * Math.PI;
    }

    @Override
    public Double calculateArea() {
        return Math.PI * radius * radius;
    }
}
