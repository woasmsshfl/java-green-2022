package lottoex01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class test6 {
    public static void main(String[] args) {
        // 6. ArrayList 로또 2개를 만들어서 비교해보기
        // Mock data
        List<Integer> lotto1 = Arrays.asList(1, 3, 5, 7, 9, 10);
        // 아래의 ArrayList<Integer> lotto2 = new ArrayList<>(); 에 add값까지 넣어둔 라이브러리.
        ArrayList<Integer> lotto2 = new ArrayList<>();

        lotto2.add(1);
        lotto2.add(3);
        lotto2.add(5);
        lotto2.add(7);
        lotto2.add(9);
        lotto2.add(10);
        // 두개 비교하는 코드
        int failCheck = 0;
        final int LOTTOCYCLE = lotto1.size(); // final(변하지않는변수) 붙은 변수는 대문자로 정의한다.

        for (int i = 0; i < LOTTOCYCLE; i++) {
            if (lotto1.get(i) == lotto2.get(i)) {
                System.out.println(i + "번지의 값이 일치합니다.");
            } else {
                failCheck = failCheck + 1;
            }
        }

        // 검증
        if (failCheck == 0) {
            System.out.println("테스트 성공");
        } else {
            System.out.println("테스트 실패");
        }

        // if (lotto1.get(0) == lotto2.get(0)) {
        // System.out.println("0번지의 값이 일치합니다.");
        // } else {
        // failCheck = failCheck + 1;
        // }
        // if (lotto1.get(1) == lotto2.get(1)) {
        // System.out.println("1번지의 값이 일치합니다.");
        // } else {
        // failCheck = failCheck + 1;
        // }
    }

}
