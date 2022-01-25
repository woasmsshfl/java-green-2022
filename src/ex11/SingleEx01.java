package ex11;

// 패턴 -> 디자인 패턴 -> 설계도를 왜 패턴으로 만들까?

// 싱글톤 패턴 = 풀링이해를 위해!!
// - 객체를 하나만 만들어서 공유할 수 있게 짠 설계도.
// 풀링 = 일정 개수를 띄워놓고 공유하는 방법.

class 튜브 {
    private static 튜브 instance = new 튜브();

    private 튜브() {
    }

    public static 튜브 getInstance() {
        System.out.println("만들어진 튜브를 가져옵니다.");
        return instance;
    }

}

public class SingleEx01 {

    public SingleEx01() {

    }

    public static void main(String[] args) {
        튜브 t1 = 튜브.getInstance();
        튜브 t2 = 튜브.getInstance();

        System.out.println(t1.hashCode());
        System.out.println(t2.hashCode());
    }

}
