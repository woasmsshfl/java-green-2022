package study;

import java.util.Scanner;

public class bubbleSort3 {
    public static void main(String[] args) {
        // 사용자입력값을 받아서 해보자!
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] data = new int[n];
        int temp;

        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data.length - i - 1; j++) {
                if (data[j] > data[j + 1]) {
                    temp = data[j + 1];
                    data[j + 1] = data[j];
                    data[j] = temp;
                }
            }
        }
        System.out.println("정렬 적용 후");
        System.out.println(data);
    }

}