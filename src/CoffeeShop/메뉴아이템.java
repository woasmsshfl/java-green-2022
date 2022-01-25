package CoffeeShop;

// 아메리카노, 카페라떼, 카라멜마끼아또, 카페모카
public class 메뉴아이템 {
	private String name;
	private int price;

	public 메뉴아이템(String name, int price) {
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public int getPrice() {
		return price;
	}
}
