package ex22;

class 사과 {
    String name = "사과";
}

class 딸기 {
    String name = "딸기";
}

class 오렌지 {
    String name = "오렌지";
}

// 왜 굳이 제네릭을 쓰나?
// 통신할 때는 상속이 안된다!
// 랜덤박스 같은것. 겉에선 같은 박스지만 내용물은 달라야 할때!
// 제네릭을 사용하면 메서드의 리턴타입을 고정시키면서 다양한 내용으로 리턴할 수 있다.!

// %제네틱 사용없이 다양한 메서드로 다양한 타입을 어떻게 리턴할 수 있을까?????? 못함!
class ResponseBox<T> {
    T data;

    public ResponseBox(T data) {
        this.data = data;
    }
}

public class GenericEx01 {
    public static void main(String[] args) {
        ResponseBox<사과> rb1 = new ResponseBox<사과>(new 사과());
        System.out.println(rb1.data.name);
        // rb1 응답!!
        ResponseBox<딸기> rb2 = new ResponseBox<딸기>(new 딸기());
        System.out.println(rb2.data.name);
        // rb2 응답!!
        ResponseBox<오렌지> rb3 = new ResponseBox<오렌지>(new 오렌지());
        System.out.println(rb3.data.name);
        // rb3 응답!!
    }

}
