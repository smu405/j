public class MP11 {
    private static final int NUM = 4;

    public static void main(String[] args) {
        Shape[] shapes = new Shape[NUM];
        shapes[0] = new Rectangle(20, 30, 50, 50);
        shapes[1] = new Circle(30, 30, 20);
        shapes[2] = new Rectangle(new Point(20, 30),
                new Point(50, 50));
        shapes[3] = new Circle(new Point(30, 30), 20);
        for (int i = 0; i < NUM; i++) {
            System.out.println(shapes[i]);
            System.out.printf("면적: %.2f\n",
                    shapes[i].getArea());
            System.out.printf("둘레: %.2f\n",
                    shapes[i].getPerimeter());
        }
    }
}
