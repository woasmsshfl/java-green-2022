package stringex.practice;

public class test17 {
    public static void main(String[] args) {
        String str1 = "abcd";
        String str2 = "c";
        boolean contains = str1.contains(str2); // 해당 문자열에 c가 존재하면 true 없으면 false
        System.out.println("contains: " + contains);
    }

}
