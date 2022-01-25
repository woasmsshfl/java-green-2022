package CoffeeShop;

public class 바리스타 {
	public 커피 makeCoffee(메뉴아이템 menuItem) {
		// 4. 커피생성.
		커피 coffee = new 커피(menuItem);
		return coffee;
	}
}
