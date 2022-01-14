package ex06;

public class ConEx03 {
    public static void main(String[] args) {
        int point = 81;

        // 중첩if문
        if (point >= 90) { // point가 90이상이면
            System.out.println("A학점입니다"); // A학점입니다를 출력 -> false
        } else { // if가 아닐때
            if (point >= 80) { // point가 80이상이면
                System.out.println("B학점입니다"); // B학점입니다를 출력 - true
            } else { // point>=80도 true가 아닐때
                System.out.println("F학점입니다"); // F학점입니다를 출력
            }
        }
    }
}