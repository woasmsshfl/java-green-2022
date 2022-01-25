package lottoex01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class test4 {
    public static void main(String[] args) {
        // 4. HashSet은 순서를 보장하지 않고 대이터를 가지기 때문에 순차정렬이 필요하다!(구글링)
        HashSet<Integer> lotto = new HashSet<>();
        lotto.add(20);
        lotto.add(7);
        lotto.add(3);
        lotto.add(45);
        lotto.add(5);
        lotto.add(6);

        System.out.println(lotto);

        // Test
        List<Integer> sortedList = new ArrayList<>(lotto);
        Collections.sort(sortedList);

        // 눈으로 확인
        System.out.println(sortedList);

        // 검증
        int failCheck = 0;
        for (int i = 0; i < 5; i++) {
            if (sortedList.get(i) < (sortedList.get(i + 1))) {
                System.out.println(i + "번지" + (i + 1) + "번지 비교 - 성공");
            } else {
                failCheck++;
            }
        }

    }

}
