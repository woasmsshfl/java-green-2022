package ex07;

class Doctor {
    String name = "홍길동"; // 문자열 입력 / 변수 = 홍길동
    int sal = 5000; // 상수 입력 / 변수 = 5000
}

public class OOPEx02 {
    public static void main(String[] args) {
        Doctor sss = new Doctor(); // new를 이용해 Doctor클래스를 heap공간에 할당하며 Doctor타입의 sss라는 변수에 대입한다.
        System.out.println(sss.name); // heap공간에 할당된 static이 아닌 name이라는 변수를 출력한다. -> 홍길동
        System.out.println(sss.sal); // heap공간에 할당된 static이 아닌 sal이라는 변수를 출력한다. -> 5000

    }

}
