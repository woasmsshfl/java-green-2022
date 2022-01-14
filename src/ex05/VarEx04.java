package ex05;

public class VarEx04 {
    public static void main(String[] args) {
        // 1. 4가지 자료형 int, long, double, boolean - 메모리 사이즈를 미리 알 수 있음
        // 2. 문자열 : 사이즈를 알 수 없다. 자료형이 아님. - 대문자로 시작함!!
        String s1 = "안녕하세요";
        System.out.println(s1);
        String s2 = s1; // 주소가 저장됨 (Main Stack *2)
        s2 = "바보"; // 새로운 heap 공간에 할당됨

        System.out.println(s1);
        System.out.println(s2);
    }

}
