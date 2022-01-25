package CoffeeShop;

public class 손님 {
	public void order(String menuName, 메뉴판 menu, 바리스타 barista) {

		// 2. 메뉴판을 보고 메뉴를 고른다.
		메뉴아이템 menuItem = menu.choose(menuName);
		if (menuItem == null) {
			System.out.println("아메리카노 한잔 주세요.");
		}
		// 3. 커피만들기
		커피 coffee = barista.makeCoffee(menuItem);

		System.out.println("아메리카노 한잔 주세요.");
		System.out.println("주문한 음료 : " + coffee.getName());
		System.out.println("가격 : " + coffee.getPrice());
	}
}
