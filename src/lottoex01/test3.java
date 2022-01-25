package lottoex01;

import java.util.HashSet;
import java.util.Random;

public class test3 {
    public static void main(String[] args) {
        // 3. HashSet으로 랜덤한 로또 번호 6개 받기
        HashSet<Integer> lotto = new HashSet<Integer>();
        Random r = new Random();

        // 반복해서 lotto에 6개 담기
        // Set 자료구조는 중복되는 데이터가 들어가면 허용하지 않음.
        while (true) {
            int n = r.nextInt(45) + 1;
            lotto.add(n);

            if (lotto.size() == 6)
                break; // 한줄코드는 중괄호 생략 가능. IF에서만!!
        }

        System.out.println(lotto);

        if (lotto.size() == 6) {
            System.out.println("테스트 종료");
        } else {
            System.out.println("테스트 실패");
        }
    }

}
