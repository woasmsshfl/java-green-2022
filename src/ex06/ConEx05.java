package ex06;

public class ConEx05 {
    public static void main(String[] args) {

        // else if를 사용하지 않고 중첩if문만 사용했을 때
        int point = 61;

        if (point >= 90) {
            System.out.println("A학점");
        } else {
            if (point >= 80) {
                System.out.println("B학점");
            } else {
                if (point >= 70) {
                    System.out.println("C학점");
                } else {
                    if (point >= 60) {
                        System.out.println("D학점");
                    } else {
                        System.out.println("F학점");
                    }
                }
            }
        }
    } // 메인 끝

}
