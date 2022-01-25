package lottoex01;

import java.util.ArrayList;

/**
 * 단위테스트!
 * 1. ArrayList에 숫자 6개 담기
 * 2. Scanner로 금액 입력받아서 횟수 정하기 ex) 5000 -> 5회
 * 3. HashSet으로 랜덤한 로또 번호 6개 받기
 * 4. HashSet은 순서를 보장하지 않고 대이터를 가지기 때문에 순차정렬이 필요하다!(구글링)
 * 5. 로또 세트(HashSet) 5개를 ArrayList에 담기
 * 6. ArrayList 로또 2개를 만들어서 비교해보기
 */

public class test1 {
    public static void main(String[] args) {
        // 1. ArrayList에 숫자 6개 담기 (Mock 데이터 : 테스트용도로 사용하는 가짜 데이터)
        ArrayList<Integer> buyLotto = new ArrayList<>();
        buyLotto.add(10);
        buyLotto.add(15);
        buyLotto.add(20);
        buyLotto.add(25);
        buyLotto.add(30);
        buyLotto.add(35);

        // 눈으로 테스트
        System.out.println(buyLotto);

        // 검증
        if (buyLotto.size() == 6) {
            System.out.println("테스트 종료");
        } else {
            System.out.println("테스트 실패");
        }
    }

}
