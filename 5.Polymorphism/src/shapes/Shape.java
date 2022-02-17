package shapes;

public abstract class Shape {

    private Double perimeter;
    private Double area;

    protected Double getPerimeter() {
        return perimeter;
    }

    protected Double getArea() {
        return area;
    }

    public abstract Double calculatePerimeter();

    public abstract Double calculateArea();

}
