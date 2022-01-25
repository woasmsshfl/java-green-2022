package stringex.practice;

public class test15 {
    public static void main(String[] args) {
        int i = 12345; // int 는 숫자니까 숫자만 반환 -> 12345
        long l = 1L; // long 도 숫자니까 숫자만 반환 -> 1
        char c = '1'; // char 는 문자니까 문자만 반환 -> 1
        System.out.println("valueOf: " + String.valueOf(i)); // 지정한 개체의 원시값을 반환.
        System.out.println("valueOf: " + String.valueOf(l)); // 원시값 : string, number, bigint, boolean, undefined,
                                                             // sysbol, null
        System.out.println("valueOf: " + String.valueOf(c));
    }

}
