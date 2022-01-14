package ex06;

public class GugudanEx02 {
    public static void main(String[] args) {
        int step;

        // 클라이언트 요구사항 : 구구단중 2단을 출력하는 프로그램을 만들어주세요.
        // for문을 활용해서 구구단을 완성하세요.

        for (int i = 2; i < 10; i++) { // 변수초기화; 10보다 작을때까지; 종료까지 1씩 더하기
            step = i; // step에 i를 대입한다. -> 2,3,4,5,6,7,8,9
            System.out.println(step + "*1=" + (step * 1));
            System.out.println(step + "*2=" + (step * 2));
            System.out.println(step + "*3=" + (step * 3));
            System.out.println(step + "*4=" + (step * 4));
            System.out.println(step + "*5=" + (step * 5));
            System.out.println(step + "*6=" + (step * 6));
            System.out.println(step + "*7=" + (step * 7));
            System.out.println(step + "*8=" + (step * 8));
            System.out.println(step + "*9=" + (step * 9));

        }

    }

}
