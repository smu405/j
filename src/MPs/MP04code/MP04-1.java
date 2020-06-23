import java.util.Scanner;

public class MP04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = "Let's meet in my office at 10";

        System.out.println("다음 문장에서 문자열을 바꾸는 프로그램입니다.");
        System.out.printf("원본 문장: %s\n", s);
        System.out.println("문장에서 바꾸고 싶은 문자열을 입력하세요: ");
        String str = sc.nextLine();
        System.out.println("새로운 문자열을 입력하세요: ");
        String str2 = sc.nextLine();
// 방법 1
//        int idx = s.indexOf(str);
//        String s1 = s.substring(0, idx);
//        String s2 = s.substring(idx + str.length());
//        String newStr = s1 + str2 + s2;

// 방법 2
        String newStr = s.replace(str, str2);
        System.out.printf("새로운 문장: %s\n", newStr);
    }
}


