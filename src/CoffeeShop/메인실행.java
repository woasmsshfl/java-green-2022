package CoffeeShop;

import java.util.ArrayList;
import java.util.List;

public class 메인실행 {

	public static void main(String[] args) {
		// 0. 메인실행프로그램 생성
		손님 customer = new 손님();
		바리스타 barista = new 바리스타();

		메뉴아이템 Americano = new 메뉴아이템("아메리카노", 1500);
		메뉴아이템 Cappuccino = new 메뉴아이템("카푸치노", 2000);
		메뉴아이템 CaramelMacchiato = new 메뉴아이템("카라멜마끼야또", 3000);
		메뉴아이템 Espresso = new 메뉴아이템("에스프레소", 4000);
		List<메뉴아이템> list = new ArrayList<>();
		list.add(Americano);
		list.add(Cappuccino);
		list.add(CaramelMacchiato);
		list.add(Espresso);

		메뉴판 menu = new 메뉴판(list);

		// 1. 커피주문
		customer.order("아메리카노", menu, barista);
	}

}
