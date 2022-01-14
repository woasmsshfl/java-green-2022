package ex07;

import java.util.Scanner;

public class GugudanTest {

    public static void main(String[] args) {

        // 변수 초기화
        int n1 = 0;
        int n2 = 0;

        Scanner sc = new Scanner(System.in);

        // 텍스트 입력란
        System.out.println("시작할 구구단의 단수를 숫자로 입력하세요."); // 시작설명
        n1 = sc.nextInt();
        System.out.println("종료할 구구단의 단수를 숫자로 입력하세요."); // 종료설명
        n2 = sc.nextInt();

        System.out.println(n1 + "단부터" + n2 + "단까지 출력합니다.");

        // 구구단 수식 시작
        for (int step = n1; step <= n2; step++) {
            for (int n = 1; n <= 9; n++) {
                System.out.println(step + "*" + n + "=" + (step * n));
            }
            System.out.println(); // 구분을 위한 공백
        } // 구구단 수식 끝
        System.out.println("요청하신 구구단 출력이 완료되었습니다.");
    }// 메인 끝
}