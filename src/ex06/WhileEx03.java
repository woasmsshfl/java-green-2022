package ex06;

public class WhileEx03 {
    public static void main(String[] args) {
        // 남은 동전 구하기 게임 (500원, 100원, 50원, 10원)
        int money = 7770; // 500원 5개, 100원 1개, 50원 1개, 10원 3개

        int restMoney = money; // call by value 밸류값을 옮김

        int coin;

        // 1. 500원 동전 구하기
        coin = 500; // coin의 값에 500을 대입한다.
        System.out.println(coin + "원=========");
        System.out.println(restMoney / coin + "개"); // money(2680)을 coin(500)으로 나눈다. -> 5개
        restMoney = restMoney % coin; // 나눈값의 나머지값을 restMoney값으로 바꾼다. -> 180원

        // 2. 100원 동전 구하기
        coin = 100; // coin의 값을 100으로 바꾼다.
        System.out.println(coin + "원=========");
        System.out.println((restMoney) / coin + "개"); // restMoney(180원)을 coin(100)으로 나눈다. -> 1개
        restMoney = restMoney % coin; // 나눈값의 나머지값을 restMoney값으로 바꾼다. -> 80원

        // 3. 50원 동전 구하기
        coin = 50; // coin의 값을 50으로 바꾼다.
        System.out.println(coin + "원=========");
        System.out.println(restMoney / coin + "개"); // restMoney(80원)을 coin(50)으로 나눈다. -> 1개
        restMoney = restMoney % coin; // 나눈값의 나머지값을 restMoney값으로 바꾼다. -> 30원

        // 4. 10원 동전 구하기
        coin = 10; // coin의 값을 10으로 바꾼다.
        System.out.println(coin + "원=========");
        System.out.println(restMoney / coin + "개"); // restMoney(30원)을 coin(10)으로 나눈다. -> 3개
        restMoney = restMoney % coin; // 나눈값의 나머지값을 restMoney값으로 바꾼다. -> 0원
    }

}
