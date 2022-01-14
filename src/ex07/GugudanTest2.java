package ex07;

import java.util.Scanner;

public class GugudanTest2 {

    void Gu() {

        Scanner sc = new Scanner(System.in);

        System.out.println("시작할 구구단의 단수를 숫자로 입력하세요.");
        int n1 = sc.nextInt();
        System.out.println("종료할 구구단의 단수를 숫자로 입력하세요.");
        int n2 = sc.nextInt();

        System.out.println(n1 + "단부터" + n2 + "단까지 출력합니다.");

        for (int step = n1; step <= n2; step++) {
            for (int n = 1; n <= 9; n++) {
                System.out.println(step + "*" + n + "=" + (step * n));
            }
            System.out.println();
        }
        System.out.println("요청하신 구구단 출력이 완료되었습니다.");
    }

    public static void main(String[] args) {

        GugudanTest2 gu = new GugudanTest2();

        gu.Gu();
    }// 메인 끝
}