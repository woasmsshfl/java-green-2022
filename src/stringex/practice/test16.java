package stringex.practice;

public class test16 {
    public static void main(String[] args) {
        String str1 = "A";
        String str2 = "B";
        int compareTo = str1.compareTo(str2); // 두개의 문자열을 아스키코드값으로 순차적으로 비교해준다.
        if (compareTo > 0) {
            System.out.println(str1 + " > " + str2);
        } else if (compareTo == 0) {
            System.out.println(str1 + " = " + str2);
        } else {
            System.out.println(str1 + " < " + str2);
        }
    }
}
