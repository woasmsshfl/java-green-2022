package ex20;

// 배열(Array) 예제
// 배열을 사용하여 사용자로부터 학생 5명의 성적을 입력받아서 평균성적 구하시오.

import java.util.Scanner;

public class ArrayEx01 {
    public static void main(String[] args) {
        final int STUDENTS = 5; // 학생수
        int total = 0; // 총점

        Scanner scan = new Scanner(System.in); // 사용자의 입력값

        int[] scores = new int[STUDENTS]; // 크기가 STUDENT인 배열 생성
        for (int i = 0; i < STUDENTS; i++) { // 변수초기화, i가 학생수보다 작을때까지, i를 1씩 더하기. 즉, 5까지의 객체를 생성한다.
            System.out.println("성적을 입력하시오.");

            scores[i] = scan.nextInt(); // i 크기의 배열 생성. 사용자의 입력값을 받아서,

        } // for 끝

        for (int i = 0; i < STUDENTS; i++) {
            total += scores[i]; // total에 받은 사용자의 입력값을 모두 더한값을 넣는다.
        } // total = scores[i1] + scores[i1] + scores[i2] + scores[i3] + scores[i4] +
          // scores[i5]

        System.out.println("평균 성적은" + total / STUDENTS + "입니다."); // total(15) / STUDENTS(5) 출력 = 3
    } // main 끝
} // Ex01 끝
