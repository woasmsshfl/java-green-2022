package study;

import java.util.Arrays;
import java.util.List;

public class bubbleSort2 {
    public static void main(String[] args) {
        List<Integer> n = Arrays.asList(7, 9, 8, 3, 4, 2, 6, 5, 1);
        System.out.println("정렬 적용 전");
        System.out.println(n); // 출력값 : 7,9,8,3,4,2,6,5,1

        int temp;

        // 조건문을 사용하자. 뭘 쓸까?
        // 중첩for문을 사용하는게 좋겠다.
        for (int i = 0; i < n.size(); i++) { // n의 배열 크기만큼 반복시킨다.
            // if문으로 노가다 했을때 반복되었던 부분(패턴)!!

            // if (n.get(1) > n.get(2)) {
            // temp = n.get(1);
            // n.set(1, n.get(2));
            // n.set(2, temp);
            // }
            // if (n.get(2) > n.get(3)) {
            // temp = n.get(2);
            // n.set(2, n.get(3));
            // n.set(3, temp);
            // }

            for (int j = 0; j < n.size() - 1; j++) { // 정렬횟수가 늘어날때마다 if하는 횟수가 1씩 줄었으니까 n의 사이즈도 1씩 줄여줘야한다.
                if (n.get(j) > n.get(j + 1)) { // 비교반복할 j가 j+1 보다 작다면
                    temp = n.get(j); // temp(null)자리에 j를 넣고
                    n.set(j, n.get(j + 1)); // j값엔 j에 +1한 값을 넣고
                    n.set(j + 1, temp); // j에 +1한 값엔 temp(j)를 넣는다.
                }
            }
        }

        System.out.println("정렬 적용 후");
        System.out.println(n); // 출력값 : 1,2,3,4,5,6,7,8,9
    }

}
