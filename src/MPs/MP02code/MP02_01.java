import java.util.Scanner;

public class MP02_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a;
        int b;
        int c;
        System.out.println("a, b, c에 해당되는 값들을 입력하세요: ");
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        double d1 = (-b + Math.sqrt(b * b - 4 * a * c)) / (2 * a);
        double d2 = (-b - Math.sqrt(b * b - 4 * a * c)) / (2 * a);
        System.out.printf("해1: %f, 해2: %f\n", d1, d2);
    }
}
