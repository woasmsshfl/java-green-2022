package study;

import java.util.Arrays;
import java.util.List;

public class bubbleSort1 {
    public static void main(String[] args) {
        List<Integer> n = Arrays.asList(7, 9, 8, 3, 4, 2, 6, 5, 1); // 1부터 9까지의 숫자가 들어가있는 배열 리스트 생성
        System.out.println("정렬 적용 전");
        System.out.println(n); // 출력값 : 7,9,8,3,4,1,6,5,2

        int temp; // 숫자를 담을 공간

        if (n.get(0) > n.get(1)) { // n의 0번자리의 숫자(7)가 n의 1번자리의 숫자(9)보다 크다면
            temp = n.get(0); // temp(null)에 0번자리의 숫자(7)를 넣고
            n.set(0, n.get(1)); // 0번자리에 1번자리 숫자(9)를 넣고
            n.set(1, temp); // 1번자리에 temp(7)를 넣는다.
        } // else 생략하여 아닐시 그대로 종료한다.
        if (n.get(1) > n.get(2)) { // 이하 반복
            temp = n.get(1);
            n.set(1, n.get(2));
            n.set(2, temp);
        }
        if (n.get(2) > n.get(3)) {
            temp = n.get(2);
            n.set(2, n.get(3));
            n.set(3, temp);
        }
        if (n.get(3) > n.get(4)) {
            temp = n.get(3);
            n.set(3, n.get(4));
            n.set(4, temp);
        }
        if (n.get(4) > n.get(5)) {
            temp = n.get(4);
            n.set(4, n.get(5));
            n.set(5, temp);
        }
        if (n.get(5) > n.get(6)) {
            temp = n.get(5);
            n.set(5, n.get(6));
            n.set(6, temp);
        }
        if (n.get(6) > n.get(7)) {
            temp = n.get(6);
            n.set(6, n.get(7));
            n.set(7, temp);
        }
        if (n.get(7) > n.get(8)) {
            temp = n.get(7);
            n.set(7, n.get(8));
            n.set(8, temp);
        }
        System.out.println("1회 정렬");
        System.out.println(n); // 출력값 : 7,8,3,4,1,6,5,2,9
        // 제일 높은 숫자인 9가 제일 오른쪽(8번째 자리)으로 배치되었다.
        // 9는 정렬되었으니 8을 제일오른쪽의 앞(7번째 자리)에 배치해야한다.
        // 그럼 8번째자리는 제외하고 배치하면 된다.

        if (n.get(0) > n.get(1)) {
            temp = n.get(0);
            n.set(0, n.get(1));
            n.set(1, temp);
        }
        if (n.get(1) > n.get(2)) {
            temp = n.get(1);
            n.set(1, n.get(2));
            n.set(2, temp);
        }
        if (n.get(2) > n.get(3)) {
            temp = n.get(2);
            n.set(2, n.get(3));
            n.set(3, temp);
        }
        if (n.get(3) > n.get(4)) {
            temp = n.get(3);
            n.set(3, n.get(4));
            n.set(4, temp);
        }
        if (n.get(4) > n.get(5)) {
            temp = n.get(4);
            n.set(4, n.get(5));
            n.set(5, temp);
        }
        if (n.get(5) > n.get(6)) {
            temp = n.get(5);
            n.set(5, n.get(6));
            n.set(6, temp);
        }
        if (n.get(6) > n.get(7)) {
            temp = n.get(6);
            n.set(6, n.get(7));
            n.set(7, temp);
        }

        System.out.println("2회 정렬");
        System.out.println(n); // 출력값 : 7,3,4,1,6,5,2,8,9
        // if문을 한개씩 줄이고 있지만 너무 길어진다...
        // 일단 노가다로 끝까지 만들어 보자..ㅠㅠ

        if (n.get(0) > n.get(1)) {
            temp = n.get(0);
            n.set(0, n.get(1));
            n.set(1, temp);
        }
        if (n.get(1) > n.get(2)) {
            temp = n.get(1);
            n.set(1, n.get(2));
            n.set(2, temp);
        }
        if (n.get(2) > n.get(3)) {
            temp = n.get(2);
            n.set(2, n.get(3));
            n.set(3, temp);
        }
        if (n.get(3) > n.get(4)) {
            temp = n.get(3);
            n.set(3, n.get(4));
            n.set(4, temp);
        }
        if (n.get(4) > n.get(5)) {
            temp = n.get(4);
            n.set(4, n.get(5));
            n.set(5, temp);
        }
        if (n.get(5) > n.get(6)) {
            temp = n.get(5);
            n.set(5, n.get(6));
            n.set(6, temp);
        }

        System.out.println("3회 정렬");
        System.out.println(n); // 출력값 : 3,4,1,6,5,2,7,8,9

        if (n.get(0) > n.get(1)) {
            temp = n.get(0);
            n.set(0, n.get(1));
            n.set(1, temp);
        }
        if (n.get(1) > n.get(2)) {
            temp = n.get(1);
            n.set(1, n.get(2));
            n.set(2, temp);
        }
        if (n.get(2) > n.get(3)) {
            temp = n.get(2);
            n.set(2, n.get(3));
            n.set(3, temp);
        }
        if (n.get(3) > n.get(4)) {
            temp = n.get(3);
            n.set(3, n.get(4));
            n.set(4, temp);
        }
        if (n.get(4) > n.get(5)) {
            temp = n.get(4);
            n.set(4, n.get(5));
            n.set(5, temp);
        }

        System.out.println("4회 정렬");
        System.out.println(n); // 출력값 : 3,1,4,5,2,6,7,8,9

        if (n.get(0) > n.get(1)) {
            temp = n.get(0);
            n.set(0, n.get(1));
            n.set(1, temp);
        }
        if (n.get(1) > n.get(2)) {
            temp = n.get(1);
            n.set(1, n.get(2));
            n.set(2, temp);
        }
        if (n.get(2) > n.get(3)) {
            temp = n.get(2);
            n.set(2, n.get(3));
            n.set(3, temp);
        }
        if (n.get(3) > n.get(4)) {
            temp = n.get(3);
            n.set(3, n.get(4));
            n.set(4, temp);
        }

        System.out.println("5회 정렬");
        System.out.println(n); // 출력값 : 1,3,4,2,5,6,7,8,9

        if (n.get(0) > n.get(1)) {
            temp = n.get(0);
            n.set(0, n.get(1));
            n.set(1, temp);
        }
        if (n.get(1) > n.get(2)) {
            temp = n.get(1);
            n.set(1, n.get(2));
            n.set(2, temp);
        }
        if (n.get(2) > n.get(3)) {
            temp = n.get(2);
            n.set(2, n.get(3));
            n.set(3, temp);
        }

        System.out.println("6회 정렬");
        System.out.println(n); // 출력값 : 1,3,2,4,5,6,7,8,9

        if (n.get(0) > n.get(1)) {
            temp = n.get(0);
            n.set(0, n.get(1));
            n.set(1, temp);
        }
        if (n.get(1) > n.get(2)) {
            temp = n.get(1);
            n.set(1, n.get(2));
            n.set(2, temp);
        }

        System.out.println("7회 정렬");
        System.out.println(n); // 출력값 : 1,2,3,4,5,6,7,8,9
        // 숫자가 순서대로 배치가 되었다!
        // 버블정렬의 특성상 숫자 1이 가장 끝에 있었다면 벌써 끝나진 않았을거다.
        // 그래서 1번 더해줘야겠다.

        if (n.get(0) > n.get(1)) {
            temp = n.get(0);
            n.set(0, n.get(1));
            n.set(1, temp);
        }

        System.out.println("8회 정렬");
        System.out.println(n); // 출력값 : 1,2,3,4,5,6,7,8,9
        // 테스트를 위해 arrayList에 있는 숫자배열을 Arrays.asList(7, 9, 8, 3, 4, 2, 6, 5, 1) 순서로 바꿔보고
        // 실행해보았다. 정상적으로 출력된다!
        // 벌써 237줄이나 되었는데 반복되고있는 패턴을 활용하여 코드를 줄여보자.
    }

}
