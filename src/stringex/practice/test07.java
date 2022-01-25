package stringex.practice;

public class test07 {
    public static void main(String[] args) {
        String str = "A*B*C*D";
        String replace = str.replace("*", "-"); // 지정한 문자열에 *가 있으면 -로 바꿔준다.
        System.out.println("replace: " + replace);
    }

}
