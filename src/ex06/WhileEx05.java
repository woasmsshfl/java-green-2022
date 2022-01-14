package ex06;

public class WhileEx05 {
    public static void main(String[] args) {

        // 변수 n을 이용해서 1부터 10까지의 숫자중 2의 배수만 출력하시오.
        // 출력이 끝나면 break문으로 빠져나오시오.
        int n = 1; // n에 1을 대입한다.
        while (true) { // while 이 실행된다.
            if (n % 2 == 0) { // n값이 2로 나눈후 나머지값이 0과 동일할 때
                System.out.println(n); // n값을 모니터에 출력한다.
            }
            n = n + 1; // n(1)에 1을 더하고 while로 올라간다.
            if (n > 10) { // n이 10보다 클때
                break; // 반복문을 종료한다.
            }
        }

    }

}