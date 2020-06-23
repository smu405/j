import java.awt.Point;

public class Rectangle {
    public static final int WIDTH = 50;
    public static final int HEIGHT = 50;
    private Point upperLeft;
    private Point lowerRight;

    public Rectangle(Point uL) {
        upperLeft = uL;
        lowerRight = new Point((int) uL.getX() + WIDTH, (int) uL.getY() + HEIGHT);
    }

    public Rectangle(Point uL, Point lR) {
        upperLeft = uL;
        lowerRight = lR;
    }

    public void translate(int x, int y) {
        upperLeft.setLocation(upperLeft.getX() + x, upperLeft.getY() + y);
        lowerRight.setLocation(lowerRight.getX() + x, lowerRight.getY() + y);
    }

    public String toString() {
       return "UL: " + upperLeft.toString() + ", LR: " + lowerRight.toString();
    }
}
