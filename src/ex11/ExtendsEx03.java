package ex11;

class 애완동물 {
    String name;
    int hp;
    int damage;
    int animalAttack;

    String animalName() {
        return name;
    }

    int animalHp() {
        return hp;
    }

    int animalDamage() {
        return damage;
    }

    int animalAttack(int zzzzzzzzz) {
        return animalAttack;
    }
}

class 강아지 extends 애완동물 {
    String name = "강아지";
    int hp = 100;
    int dogDamage = 15;

    String animalName() {
        return name;
    }

    int animalHp() {
        return hp;
    }

    int animalDamage() {
        return dogDamage;
    }

    int animalAttack(int zzzzzzzzz) {
        hp = hp - zzzzzzzzz;
        return hp;
    }

}

class 고양이 extends 애완동물 {
    String name = "고양이";
    int hp = 100;
    int catDamage = 10;

    String animalName() {
        return name;
    }

    int animalHp() {
        return hp;
    }

    int animalDamage() {
        return catDamage;
    }

    int animalAttack(int zzzzzzzzz) {
        hp = hp - zzzzzzzzz;
        return hp;
    }

}

class 도마뱀 extends 애완동물 {
    String name = "도마뱀";
    int hp = 100;
    int lizardDamage = 33;

    String animalName() {
        return name;
    }

    int animalHp() {
        return hp;
    }

    int animalDamage() {
        return lizardDamage;
    }

    int animalAttack(int zzzzzzzzz) {
        hp = hp - zzzzzzzzz;
        return hp;
    }

}

public class ExtendsEx03 {

    static void attack(애완동물 u1, 애완동물 u2) {
        System.out.println(u1.animalName() + "이(가)" + u2.animalName() + "에게 공격당했습니다.");
        System.out.println(u1.animalName() + "의 HP : " + u1.animalAttack(u2.animalDamage()));

    }

    public static void main(String[] args) {
        애완동물 dog = new 강아지();
        애완동물 cat = new 고양이();
        애완동물 lizard = new 도마뱀();

        // attack(dog, cat);
        // attack(cat, dog);
        // attack(dog, cat);
        // attack(cat, dog);
        attack(dog, lizard);
        attack(lizard, dog);

    }
}