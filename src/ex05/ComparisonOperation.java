package ex05;

public class ComparisonOperation {
    public static void main(String[] args) {
        int x = 3; // x는 3이다.
        int y = 4; // y는 4이다.
        System.out.println(x == y); // x(3)은 y(4)와 같은가? -> 아니요(false)
        System.out.println(x != y); // x(3)은 y(4)와 다른가? -> 예(true)
        System.out.println(x > y); // x(3)은 y(4)보다 큰가? -> 아니요(false)
        System.out.println(x < y); // x(3)은 y(4)보다 작은가? -> 예(true)
        System.out.println(x <= y); // x(3)은 y(4)보다 작거나 같은가(이하인가)? -> 예(true)
    }

}
