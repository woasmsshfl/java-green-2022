package ex07;

class Car {
    int speed = 90;
}

public class OOPEx01 {

    public static void main(String[] args) {
        // new는 heap공간에 할당을 명령하는 키워드. / heap공간은 동적공간.
        // Car 클래스가 가지고 있는 static이 아닌 모든 것들이 heap공간에 띄워진다.
        Car s1 = new Car(); // Car라는 이름을 가진 custom타입
        System.out.println(s1.speed); // .은 연결연산자이고 .앞에 대문자인 토큰이 있다면 무조건 static

        Car s2 = new Car(); // new를 추가할 때 마다 heap에 새로운 영역을 할당한다.
        System.out.println(s2.speed);

        new Car(); // heap에 할당되지만 변수가 지정되지 않았기 때문에 garvage collentor가 해당영역을 삭제시킨다.
    }

}
