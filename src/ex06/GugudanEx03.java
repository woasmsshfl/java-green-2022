package ex06;

public class GugudanEx03 {
    public static void main(String[] args) {

        // 클라이언트 요구사항 : 구구단중 2단을 출력하는 프로그램을 만들어주세요.
        // 중첩for문을 이용해서 구구단을 만드시오.

        for (int step = 2; step <= 9; step++) {
            for (int n = 1; n <= 9; n++) {
                System.out.println(step + "*" + n + "=" + (step * n));

            }
        }
    }
}