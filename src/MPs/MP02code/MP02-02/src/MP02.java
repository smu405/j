import java.util.Scanner;

public class MP02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("R1, R2, Height를 입력하시오");
        double r1 = sc.nextDouble();
        double r2 = sc.nextDouble();
        double height = sc.nextDouble();
        double v = (1 / 3.) * Math.PI * (r1 * r1 + r1 * r2 + r2 * r2) * height;
        System.out.printf("원뿔대 부피: %f\n", v);
    }
}
