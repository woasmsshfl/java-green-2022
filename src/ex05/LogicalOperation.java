package ex05;

public class LogicalOperation {
    public static void main(String[] args) {
        int x = 3; // x는 3이다.
        int y = 4; // y는 4이다.

        // 논리연산자 &&(AND) , ||(OR)
        // 논리연산은 True, False에만 가능하다.

        System.out.println((x == 3) && (y == 7)); // x가 3이 맞고 동시에 y가 7이 맞는가(AND)? -> 아니요(false)
        // (True) AND (False) -> False
        System.out.println((x == 3) || (y == 4)); // x가 3이 맞거나 y가 4가 맞는가(OR)? -> 예(true)
        // (True) OR (True) -> True
    }

}
