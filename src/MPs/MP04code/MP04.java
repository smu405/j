// 문자열 생성
// "Let's meet in my office at 10 in the morning"
// 사용자로부터 치환할 원본 단어 입력 받기 srcWord
// 사용자로부터 치환할 대상 단어 입력 받기 destWord
// 원본 단어의 위치 찾아내서 srcPos에 저장
// 0부터 srcPos - 1까지 substring로 추출 dest1
// srcPos + srcWord.length() 부터 substring로 추출 dest2
// dest1 + destWord + dest2를 화면에 출력

import java.util.Scanner;

public class MP04 {
    public static void main(String[] args) {
        String s = "Let's meet in my office at 10";
        System.out.println("다음 문장에서 문자열을 바꾸는 프로그램입니다.");
        System.out.println("원본 문장: " + s);
        Scanner sc = new Scanner(System.in);
        System.out.println("문장에서 바꾸고 싶은 문자열을 입력하세요: ");
        String srcWord = sc.nextLine();
        System.out.println("새로운 문자열을 입력하세요: ");
        String destWord = sc.nextLine();
        int srcPos = s.indexOf(srcWord);
        String dest1 = s.substring(0, srcPos);
        String dest2 = s.substring(srcPos + srcWord.length());
        String newstr = dest1 + destWord + dest2;
        System.out.println("새로운 문장: " + newstr);
    }
}
