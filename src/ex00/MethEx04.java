package ex00;

// 오버 로딩(over loading) = 과적재

class 사자 {
    String name = "사자";
    int hp = 100;
    int attack = 10;
}

class 호랑이 {
    String name = "호랑이";
    int hp = 100;
    int attack = 15;
}

class 곰 {
    String name = "곰";
    int hp = 100;
    int attack = 50;
}

public class MethEx04 {

    // 사자가 호랑이를 공격
    static void attackLionToTiger(사자 unit1, 호랑이 unit2) {
        System.out.println("[" + unit2.name + "]" + "  이(가)  " + "[" + unit1.name + "]" + "  에게 공격당하고 있습니다.");
        unit2.hp = unit2.hp - unit1.attack;
        System.out.println(unit2.name + "의 HP : " + unit2.hp);
    }

    // 사자가 곰을 공격
    static void attackLionToBear(사자 unit1, 곰 unit2) {
        System.out.println("[" + unit2.name + "]" + "  이(가)  " + "[" + unit1.name + "]" + "  에게 공격당하고 있습니다.");
        unit2.hp = unit2.hp - unit1.attack;
        System.out.println(unit2.name + "의 HP : " + unit2.hp);
    }

    // 호랑이가 사자를 공격
    static void attackTigerToLion(호랑이 unit1, 사자 unit2) {
        System.out.println("[" + unit2.name + "]" + "  이(가)  " + "[" + unit1.name + "]" + "  에게 공격당하고 있습니다.");
        unit2.hp = unit2.hp - unit1.attack;
        System.out.println(unit2.name + "의 HP : " + unit2.hp);
    }

    // 호랑이가 곰을 공격
    static void attackTigerToBear(호랑이 unit1, 곰 unit2) {
        System.out.println("[" + unit2.name + "]" + "  이(가)  " + "[" + unit1.name + "]" + "  에게 공격당하고 있습니다.");
        unit2.hp = unit2.hp - unit1.attack;
        System.out.println(unit2.name + "의 HP : " + unit2.hp);
    }

    // 곰이 사자를 공격
    static void attackBearToLion(곰 unit1, 사자 unit2) {
        System.out.println("[" + unit2.name + "]" + "  이(가)  " + "[" + unit1.name + "]" + "  에게 공격당하고 있습니다.");
        unit2.hp = unit2.hp - unit1.attack;
        System.out.println(unit2.name + "의 HP : " + unit2.hp);
    }

    // 곰이 호랑이를 공격
    static void attackBearToTiger(곰 unit1, 호랑이 unit2) {
        System.out.println("[" + unit2.name + "]" + "  이(가)  " + "[" + unit1.name + "]" + "  에게 공격당하고 있습니다.");
        unit2.hp = unit2.hp - unit1.attack;
        System.out.println(unit2.name + "의 HP : " + unit2.hp);
    }

    public static void main(String[] args) {
        사자 Lion1 = new 사자();
        호랑이 Tiger1 = new 호랑이();
        곰 Bear1 = new 곰();

        attackLionToTiger(Lion1, Tiger1);
        attackLionToBear(Lion1, Bear1);
        attackTigerToLion(Tiger1, Lion1);
        attackTigerToBear(Tiger1, Bear1);
        attackBearToLion(Bear1, Lion1);
        attackBearToTiger(Bear1, Tiger1);
    }

}
