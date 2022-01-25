package ex11;

/**
 * 신입이 실수하지 않는 설계를 해보자.
 * 신입이 실수하면 내 책임!
 */

// 추상클래스(abstract class)
// 1. new 할 수 없다.
// 2. 추상 메서드를 만들 수 있다. (객체의 행위를 공통적으로 정의할 수 없을 때 )
// 3. 일반 메서드도 만들 수 있다.(객체의 행위를 공통적으로 정의할 수 있을 때(구체적))
abstract class ProtossUnit { // 종족이름

    abstract void setHp(int hp); // hp가 변하는 메소드

    abstract int getHp(); // hp를 찾는 메소드

    abstract int getAttack(); // attack을 찾는 메소드
}

// 1. 일반 클래스는 추상 메서드를 가질 수 없다. = 구체적인 클래스이기 때문에 추상적인 메소드를 넣을 수 없다.
class Zealot extends ProtossUnit { // 근거리 공격
    // 전역변수 , 상태변수 : new할때 메모리(heap)에 뜨는 변수.
    String name = "질럿";
    int hp = 100;
    int attack = 10;

    // alt + enter = 도움말 호출 => add unimplemented methods(자동으로 오버라이드 메소드 생성)
    @Override
    void setHp(int hp) {
        this.hp = hp;
    }

    @Override
    int getHp() {
        return hp;
    }

    @Override
    int getAttack() {
        return attack;
    }

}

class Dragoon extends ProtossUnit { // 원거리 공격
    String name = "드라군";
    int hp = 100;
    int attack = 20;

    @Override
    void setHp(int hp) {
        this.hp = hp;
    }

    @Override
    int getHp() {
        return hp;
    }

    @Override
    int getAttack() {
        return attack;
    }

}

class DarkTempler extends ProtossUnit { // 원거리 공격
    String name = "다크템플러";
    int hp = 100;
    int attack = 50;

    @Override
    void setHp(int hp) {
        this.hp = hp;
    }

    @Override
    int getHp() {
        return hp;
    }

    @Override
    int getAttack() {
        return attack;
    }

}

// 신입아 DarkTempler 하나 만들어!!
// name = 다크템플러
// hp = 100
// attack = 50
// 꼭 ProtossUnit으로 추상화 해야해!
// 테스트 => 다크템플러가 질럿을 공격할것!

public class ExtendsEx04 {

    static void attack(ProtossUnit u1, ProtossUnit u2) {
        // 1. u1이 u2를 공격 => u2.hp = u2.hp - u1.attack => 자식변수에 접근x => 오버라이드 필요!
        u2.setHp(u2.getHp() - u1.getAttack());
        // 1-1. u2.hp를 찾는 메소드, u1.attack을 찾는 메소드, u2.hp를 바꾸는 메소드가 필요하다!
        // 2. u2의 hp를 출력 => sysout(u2.hp)
        System.out.println(u2.getHp());
    }

    public static void main(String[] args) {
        ProtossUnit z1 = new Zealot();
        ProtossUnit d1 = new Dragoon();
        ProtossUnit t1 = new DarkTempler();
        attack(z1, d1);
        attack(d1, z1);

        attack(t1, z1);
    }

}
