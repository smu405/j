import java.util.Scanner;

public class MP06 {
    public static void main(String[] args) {
        Dice dice = new Dice();
        Scanner sc = new Scanner(System.in);
        System.out.println("주사위를 몇 번 던질지 횟수를 입력하시오: ");
        int n = sc.nextInt();
        int sum  = 0;
        if (n > 0) {
            System.out.printf("횟수: %d\n", n);
            for (int i = 0; i < n; i++) {
                int n2 = dice.roll();
                sum += n2;
//                System.out.printf("n = %d\n", n2);
            }
            System.out.printf("합계: %d\n", sum);
            if (sum % 2 == 0) {
                System.out.println("짝수가 나왔으므로 버스를 타야 합니다.");
            }
            else {
                System.out.println("홀수가 나왔으므로 지하철을 타야 합니다.");
            }
        }
    }
}
