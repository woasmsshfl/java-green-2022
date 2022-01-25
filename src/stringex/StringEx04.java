package stringex;

import java.util.Scanner;

class User {
    private String name;
    private String tel;
    private char gender;
    private int age;

    public User(String name2, String tel2, char gender2, int age2) {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

public class StringEx04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // A01-이름:홍길동-전화번호:0102222-성별:남-나이: 20
        // String data = sc.nextLine();
        String data = "A01-이름:홍길동-전화번호:0102222-성별:남-나이: 20";

        String[] tokens = data.split("-");
        // System.out.println(tokens[0]);
        // System.out.println(tokens[1]);
        // System.out.println(tokens[2]);
        // System.out.println(tokens[3]);
        // System.out.println(tokens[4]);

        if (tokens[0].equals("A01")) {
            // 1. 이름:홍길동을 :로 구분해서 홍길동을 찾자.
            String name = tokens[1].split(":")[1];

            // 2. 전화번호:0102222를 :로 구분해서 0102222를 찾자.
            String tel = tokens[2].split(":")[1];

            // 3. 성별:남 을 :로 구분해서 남을 찾자.
            String genderTemp = tokens[3].split(":")[1];

            // 4. 나이: 20 :로 구분헤서 20을 찾자.
            String ageTemp = tokens[4].split(":")[1];

            // 5. char, int 등등 형변환 하기
            char gender = genderTemp.charAt(0);
            String ageTrim = ageTemp.trim();
            int age = Integer.parseInt(ageTrim);

            // 6. class로 옮겨담기.
            User user = new User(name, tel, gender, age);

            System.out.println("end if");

        } else {
            System.out.println("프로그램 종료");
        }

    }

}
