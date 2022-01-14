package ex07;

// 1. JAVA는 모든 코드가 Class 내부에 있어야 한다.
// 2. JAVA는 Class만이 1급이다.
// 3. Class = 설계도
// 4. 클래스는 상태(변수)와 행위(메소드)를 가진다.
// 5. 메모리영역에서 static을 찾을때 클래스명.변수명 을 입력하여 찾는다.
// 6. static이 아닌 데이터를 메모리에 띄우고 싶을땐 new 클래스명() 을 입력하여 찾는다.(heap공간)

class Dog { // 1급 = 가장 바깥영역에 존재할 수 있는 것.
    int 배고픔 = 100; // 0~100 (100이 가장 배고픈 상태)

    void 밥먹기() { // 행위(메서드) / void = 출구가 없을 때 사용한다.
        배고픔 = 0;
    }
}

public class OOPEx04 {
    public static void main(String[] args) {
        Dog d = new Dog();
        System.out.println(d.배고픔);
        d.밥먹기(); // 행위
        System.out.println(d.배고픔);
    }

}
