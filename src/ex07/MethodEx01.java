package ex07;

public class MethodEx01 {

    // 행위(메소드)
    static void add(int n1) {
        System.out.println("받은 숫자는 " + n1);
    }

    public static void main(String[] args) {
        MethodEx01.add(5000); // 메소드 호출
    }
}
