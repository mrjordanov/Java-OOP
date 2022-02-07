package PointInRecangle;



public class Rectangle {
    private int bottomLeftX;
    private int bottomLeftY;
    private int topRightX;
    private int topRightY;

    public Rectangle(int bottomLeftX, int bottomLeftY, int topRightX, int topRightY) {
        this.bottomLeftX = bottomLeftX;
        this.bottomLeftY = bottomLeftY;
        this.topRightX = topRightX;
        this.topRightY = topRightY;
    }

    public boolean contains(Point point) {
        if (isXinRange(point) && isYinRange(point)) {
            return true;
        }
        return false;
    }

    private boolean isYinRange(Point point) {
        return point.getY() >= bottomLeftY && point.getY() <= topRightY;
    }

    private boolean isXinRange(Point point) {
        return point.getX() >= bottomLeftX && point.getX() <= topRightX;
    }

}
