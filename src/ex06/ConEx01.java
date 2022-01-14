package ex06;

public class ConEx01 {
    public static void main(String[] args) {
        int point = 89; // 성적

        // 자바에서 괄호()이후에 중괄호{}가 나올때는 모두 행위의 영역이다.
        if (point >= 90) { // 만약에 point(90)이 90이상이라면
            System.out.println("A학점입니다."); // A학점입니다. 를 출력한다.
        } else { // if가 아닐때 실행한다.
            System.out.println("A학점이 아닙니다."); // A학점이 아닙니다. 를 출력한다.
        }
    }

}
