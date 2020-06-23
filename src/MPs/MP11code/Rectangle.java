public class Rectangle extends Shape {
    private Point p1, p2;
    public Rectangle(Point p1, Point p2) {
        this.p1 = p1;
        this.p2 = p2;
    }

    public Rectangle(int x1, int y1, int x2, int y2) {
        p1 = new Point(x1, y1);
        p2 = new Point(x2, y2);
    }

    @Override
    public double getArea() {
        int width = Math.abs(p2.getX() - p1.getX());
        int height = Math.abs(p2.getY() - p1.getY());
        return  width * height;
    }

    @Override
    public double getPerimeter() {
        int width = Math.abs(p2.getX() - p1.getX());
        int height = Math.abs(p2.getY() - p1.getY());
        return (width + height) * 2;
    }

    @Override
    public String toString() {
        return "Rectangle:\np1: "
                + p1.toString()
                + "\np2: " + p2.toString();
    }
}
