import java.util.Scanner;

public class HashCode {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] s = new char[5];
        System.out.println("문자 다섯 개를 한 줄에 한 개씩 입력하세요");
        s[0] = sc.next().charAt(0);
        s[1] = sc.next().charAt(0);
        s[2] = sc.next().charAt(0);
        s[3] = sc.next().charAt(0);
        s[4] = sc.next().charAt(0);
        double hash = (int) s[0] * Math.pow(31, 4)
                + (int) s[1] * Math.pow(31, 3)
                + (int) s[2] * Math.pow(31, 2)
                + (int) s[3] * Math.pow(31, 1)
                + (int) s[4] * Math.pow(31, 0);
        System.out.printf("문자열 %c%c%c%c%c의 해시 값은 %.2f입니다.",
                          s[0], s[1], s[2], s[3], s[4], hash);
    }
}
