package ex05;

public class VarEx03 {
    public static void main(String[] args) {
        int n1 = 10; // 4Byte
        double n3 = 30.1; // 8Byte

        double t1 = n1; // 묵시적 형변환
        int t2 = (int) n3; // 명시적 형변환

        System.out.println(t1);
        System.out.println(t2);

    }

}
