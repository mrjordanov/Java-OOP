package shapes;

public class Rectangle extends Shape {

    private Double height;
    private Double width;

    public Rectangle(Double height, Double width) {
        this.setHeight(height);
        this.setWidth(width);
    }


    public void setHeight(Double height) {
        if (height > 0) {
            this.height = height;
        } else {
            throw new IllegalArgumentException("The height of rectangle can`t be zero ore negative");
        }
    }

    public void setWidth(Double width) {
        if (width > 0) {
            this.width = width;
        } else {
            throw new IllegalArgumentException("The width of rectangle can`t be zero ore negative");
        }
    }


    @Override
    public Double calculatePerimeter() {
        return 2 * (height + width);
    }

    @Override
    public Double calculateArea() {
        return height * width;
    }
}
