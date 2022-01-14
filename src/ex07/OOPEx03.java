package ex07;

// 설계도 생성
class 마법사 { // 행위는 클래스가 가지고 있어야 한다!
    int hp = 30; // 상태
    int mp = 100; // 상태

    // 행위(메서드) 지정
    // 1. 행위는 행위안에 추가할 수 없다.
    // 2. 행위는 메서드 이름 + () + {} 로 이루어진다.
    void drink() { // heap공간에 drink라는 이름의 행위를 할당한다.
        System.out.println("에너지 마시기");
        hp = 100; // hp를 100으로 변경한다.
    }
}

public class OOPEx03 {
    public static void main(String[] args) {
        마법사 s1 = new 마법사();
        System.out.println("첫번째 마법사가 생성되었습니다");
        System.out.println("체력 : " + s1.hp);
        System.out.println("마나 : " + s1.mp);

        s1.drink(); // 메서드 호출(call) -> 에너지 마시기 라는 행위를 실행한다.
        System.out.println("체력 변경 : " + s1.hp); // 체력변경 100을 출력한다.

        // 마법금지 = 상태는 행위를 통해서 변경한다.
        // s1.hp = 50;
        // System.out.println("체력 변경 : " + s1.hp);

        마법사 s2 = new 마법사();
        System.out.println("두번째 마법사가 생성되었습니다");
        System.out.println("체력 : " + s2.hp);
        System.out.println("마나 : " + s2.mp);
    }

}
