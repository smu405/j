import java.awt.Point;

public class Main {
    public static void main(String[] args) {
        Block1 b1 = new Block1(10, 10);
        Block2 b2 = new Block2(10, 10);
        Block3 b3 = new Block3(10, 10);

        System.out.println("b1");
        System.out.println(b1);
        b1.translate(10, -10);
        System.out.println("b1");
        System.out.println(b1);
        System.out.println("b2");
        System.out.println(b2);
        b2.translate(10, -10);
        System.out.println("b2");
        System.out.println(b3);
        System.out.println("b3");
        System.out.println(b3);
        b3.translate(10, -10);
        System.out.println("b3");
        System.out.println(b3);
    }
}
