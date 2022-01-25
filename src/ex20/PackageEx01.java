package ex20;

// 패키지 Math class
public class PackageEx01 {
    public static void main(String[] args) {
        double e = Math.E; // 자연 로그의 밑수
        double pi = Math.PI; // 파이값

        System.out.println(Math.abs(e)); // 절대값
        System.out.println(Math.acos(e));
        System.out.println(Math.asin(e));
        System.out.println(Math.atan(e));
        System.out.println(Math.atan2(e, pi));
        System.out.println(Math.cos(e)); // cosine
        System.out.println(Math.cosh(e));
        System.out.println(Math.exp(e));
        System.out.println(Math.hypot(e, pi));
        System.out.println(Math.log(e));
        System.out.println(Math.log10(e));
        System.out.println(Math.max(e, pi)); // 둘중 큰값
        System.out.println(Math.min(e, pi)); // 둘중 작은값
        System.out.println(Math.pow(e, pi)); // e의 pi제곱
        System.out.println(Math.random()); // 0.0~1.0 사이의 난수 반환
        System.out.println(Math.sin(e)); // sine
        System.out.println(Math.sinh(e));
        System.out.println(Math.sqrt(e)); // 제곱근
        System.out.println(Math.tanh(e));
        System.out.println(Math.toDegrees(e));
        System.out.println(Math.toRadians(e));

    }

}
