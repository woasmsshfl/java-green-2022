package lottoex01;

import java.util.Scanner;

public class test2 {
    public static void main(String[] args) {
        // 2. Scanner로 금액 입력받아서 횟수 정하기 ex) 5000 -> 5회
        // Mock Data
        Scanner sc = new Scanner(System.in);
        long money = sc.nextLong(); // int는 21억 이상 샐 수 없기 때문에 long 사용
        int count = (int) money / 1000; // 다운캐스팅

        // 눈으로 체크
        System.out.println("받은 금액 : " + money);
        System.out.println("로또 횟수 : " + count);

        // 검증
        if (count == 5) {
            System.out.println("테스트 종료");
        } else {
            System.out.println("테스트 실패");
        }
    }

}
