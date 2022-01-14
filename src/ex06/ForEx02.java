package ex06;

public class ForEx02 {
    public static void main(String[] args) {
        // for문을 이용하여 2의 24제곱을 출력하시오.
        // for문은 연산에만 이용하고 출력은 조건을 걸어서 따로한다.

        int i = 1; // 배수의 시작
        // 연산
        for (int n = 1; n < 25; n = n + 1) { // n에 1을 넣는다, n이 25보다 작을때까지 반복한다, n은 반복마다 +1씩 증가한다.
            i = i * 2; // 2배수 연산
        }
        // 출력
        System.out.println(i); // 24번 반복한 값을 출력한다.

    } // 메인 끝

}
