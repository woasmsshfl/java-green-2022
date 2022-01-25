package stringex;

import java.util.Scanner;

public class StringTest01 {
    public static void main(String[] args) {
        // A01 - 이름 : 홍길동 - 전화번호 : 0102222 - 성별 : 남 - 나이 : 20
        Scanner sc = new Scanner(System.in);
        System.out.println("번호 - 이름 - 전화번호 - 성별 - 나이 순서로 입력하세요.");
        String data = sc.nextLine();

        String str = data;
        String[] tokens = str.split("-");
        String[] subs = { "이름 : ", "전화번호 : ", "성별 : ", "나이 : " };

        for (int i = 0; i < tokens.length; i++) {
            for (int n = 0; i < subs.length; n++) {
                String sub = subs[n];
                System.out.println(subs[n] + tokens[i]);
            }

        }

        String name = tokens[1];
        int number = Integer.parseInt(tokens[2]);
        String gender = tokens[3];
        int age = Integer.parseInt(tokens[4]);

    }

}
