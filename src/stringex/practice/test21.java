package stringex.practice;

public class test21 {
    public static void main(String[] args) {
        int i = 123456;
        String str1 = String.format("%,d", i); // integer formatting, 10진수
        String str2 = "123456";
        boolean matches = str1.matches(str2); // 지정한 문자열안의 내용과 일치하는게 있으면 true 없으면 false
        System.out.println("matches: " + matches);
    }

}
