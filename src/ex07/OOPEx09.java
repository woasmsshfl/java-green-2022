package ex07;

class Person3 {
    String name;
    int height;
    int weight;

    Person3(String name, int height, int weight) {
        this.name = name; // 변수명이 동일할 때, this사용한다. 가까이 있는 변수가 아닌 heap에 있는 변수를 사용하겠다.
        this.height = height;
        this.weight = weight;

    }
}

public class OOPEx09 {
    public static void main(String[] args) {
        Person3 s1 = new Person3("홍길동", 170, 70); // 생성자 호출(=메소드 호출)
        Person3 s2 = new Person3("임꺽정", 150, 200);
        System.out.println(s1.name);
        System.out.println(s2.name);

    }

}
