package ex00;

// 오버 로딩(over loading) = 과적재

/**
 * 1. 메서드는 동일한 이름으로 만들 수 없다.
 * 2. 단, 매개변수의 타입, 위치, 개수가 다르면 다른 메서드로 인식한다(오버로딩)
 * 3. 개발자 입장에서 함수이름(호출)을 하나만 기억해도 된다.(장점)
 * 4. 경우의 수가 너무 많아지면 너무 많은 메서드가 필요해서 퇴사마렵다. (단점, 한계)
 * - 경우의 수가 몇개 없을때! 10가지~20가지 안쪽.
 */

class 사자1 {
    String name = "사자";
    int hp = 100;
    int attack = 10;
}

class 호랑이1 {
    String name = "호랑이";
    int hp = 100;
    int attack = 15;
}

class 곰1 {
    String name = "곰";
    int hp = 100;
    int attack = 50;
}

public class MethEx05 {

    // 사자가 호랑이를 공격
    static void attack(사자1 unit1, 호랑이1 unit2) {
        // 스택의 이름이 같아도 인수argument(매개변수)가 다르기 때문에 다른 메소드로 인식해서 가능하다! 오버로딩
        System.out.println("[" + unit2.name + "]" + "  이(가)  " + "[" + unit1.name + "]" + "  에게 공격당하고 있습니다.");
        unit2.hp = unit2.hp - unit1.attack;
        System.out.println(unit2.name + "의 HP : " + unit2.hp);
    }

    // 사자가 곰을 공격
    static void attack(사자1 unit1, 곰1 unit2) {
        System.out.println("[" + unit2.name + "]" + "  이(가)  " + "[" + unit1.name + "]" + "  에게 공격당하고 있습니다.");
        unit2.hp = unit2.hp - unit1.attack;
        System.out.println(unit2.name + "의 HP : " + unit2.hp);
    }

    // 호랑이가 사자를 공격
    static void attack(호랑이1 unit1, 사자1 unit2) {
        System.out.println("[" + unit2.name + "]" + "  이(가)  " + "[" + unit1.name + "]" + "  에게 공격당하고 있습니다.");
        unit2.hp = unit2.hp - unit1.attack;
        System.out.println(unit2.name + "의 HP : " + unit2.hp);
    }

    // 호랑이가 곰을 공격
    static void attack(호랑이1 unit1, 곰1 unit2) {
        System.out.println("[" + unit2.name + "]" + "  이(가)  " + "[" + unit1.name + "]" + "  에게 공격당하고 있습니다.");
        unit2.hp = unit2.hp - unit1.attack;
        System.out.println(unit2.name + "의 HP : " + unit2.hp);
    }

    // 곰이 사자를 공격
    static void attack(곰1 unit1, 사자1 unit2) {
        System.out.println("[" + unit2.name + "]" + "  이(가)  " + "[" + unit1.name + "]" + "  에게 공격당하고 있습니다.");
        unit2.hp = unit2.hp - unit1.attack;
        System.out.println(unit2.name + "의 HP : " + unit2.hp);
    }

    // 곰이 호랑이를 공격
    static void attack(곰1 unit1, 호랑이1 unit2) {
        System.out.println("[" + unit2.name + "]" + "  이(가)  " + "[" + unit1.name + "]" + "  에게 공격당하고 있습니다.");
        unit2.hp = unit2.hp - unit1.attack;
        System.out.println(unit2.name + "의 HP : " + unit2.hp);
    }

    public static void main(String[] args) {
        사자1 Lion1 = new 사자1();
        호랑이1 Tiger1 = new 호랑이1();
        곰1 Bear1 = new 곰1();

        attack(Lion1, Tiger1);
        attack(Lion1, Bear1);
        attack(Tiger1, Lion1);
        attack(Tiger1, Bear1);
        attack(Bear1, Lion1);
        attack(Bear1, Tiger1);

        System.out.println(1);
        System.out.println(1.0);
        System.out.println(true);
    }

}
