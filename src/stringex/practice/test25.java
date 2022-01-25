package stringex.practice;

public class test25 {
    public static void main(String[] args) {
        String str = "tete";

        System.out.println(String.format("%s_", str)); // 문자열을 그대로 출력하고 뒤에 _를 붙힌다.
        System.out.println(String.format("%12s_", str)); // 문자열을 10진수 12자리까지 출력하고 앞에 공백을 넣는다.
        System.out.println(String.format("%-12s_", str)); // 문자열을 10진수 12자리까지 출력하고 뒤에 공백을 넣는다.
        System.out.println(String.format("%.2s_", str)); // 문자열을 2자리까지만 출력하고 10진수 12자리까지 출력하고 뒤에 공백.
        System.out.println(String.format("%-12.2s_", str)); // 문자열을 2자리까지만 출력하고 10진수 12자리까지 출력하고 _앞에 공백
        System.out.println(String.format("%12.2s_", str)); // 문자열을 2자리까지만 출력하고 10진수 12자리까지 출력하고 문자열 앞에 공백

    }

}
