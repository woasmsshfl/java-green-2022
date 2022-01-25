package stringex.practice;

public class test20 {
    public static void main(String[] args) {
        int i = 123456789;
        String str = String.format("%,d", i); // integer formatting, 10진수(정수), %과 d사이에 ,를 넣으면 3자리로 나누고
        // 숫자를 넣으면 해당 숫자만큼을 반환한다.
        System.out.println("format: " + str);
    }

}
