package ex20;

// 라이브러리 사용하기
// 라이브러리의 종류가 너무 많으므로 외우지말고 걍 구글링하자!
public class LibEx01 {
    public static void main(String[] args) {
        double num = 10.5;

        double result = Math.abs(-10.0);
        double result2 = Math.ceil(num); // 올림 라이브러리
        double result3 = Math.floor(num); // 내림 라이브러리
        System.out.println(result);
        System.out.println(result2);
        System.out.println(result3);

        System.out.println("======================");
        double a = 1234.56789;
        System.out.println(Math.round(a)); // 반올림 라이브러리
    } // 메인 끝

}
