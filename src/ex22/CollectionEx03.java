package ex22;

import java.util.HashSet;
import java.util.Random;

public class CollectionEx03 {
    public static void main(String[] args) {
        Random r = new Random();

        // HashSet 생성
        HashSet<Integer> lotto = new HashSet<Integer>();

        while (true) {
            // HashSet에 n값을 add해서 저장
            lotto.add(r.nextInt(45) + 1);
            // HashSet 데이터 크기가 6이 되면 break
            if (lotto.size() == 6) {
                break;
            }
        }

        // HashSet 데이터 출력
        System.out.println(lotto);
    }

}
