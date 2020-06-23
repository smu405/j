public class Circle extends Shape {
    private Point center;
    private int radius;

    public Circle(Point p, int r) {
        center = p;
        radius = r;
    }

    public Circle(int x, int y, int r) {
        center = new Point(x, y);
        radius = r;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public String toString() {
        return "Circle:\ncenter: " + center.toString()
                 + "\nradius: " + radius;
    }
}
