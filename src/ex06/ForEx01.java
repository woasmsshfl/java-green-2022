package ex06;

public class ForEx01 {
    public static void main(String[] args) {

        for (int n = 1; n < 11; n = n + 1) { // 변수 초기값; 조건문; 변동값을 순서대로 넣는다.
            // 변수값(n에 1을 대입한다); n이 100보다 작을때까지; 반복마다 n에 1을 더한다.
            if (n % 3 == 0) { // n을 3으로 나누었을때
                System.out.println(n); // n값을 출력한다.
            }
        }
    }

}
