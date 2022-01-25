package stringex.practice;

public class test09 {
    public static void main(String[] args) {
        String str = "A:B:C:D:abcd";
        String[] split = str.split(":"); // 지정만 문자를 기준으로 문자열을 배열로 바꾼다.
        System.out.println("split: " + split[1]);
    }
}
