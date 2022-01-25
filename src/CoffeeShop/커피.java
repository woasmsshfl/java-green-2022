package CoffeeShop;

public class 커피 {

	private String name;
	private int price;

	public 커피(메뉴아이템 menuItem) {
		this.name = menuItem.getName();
		this.price = menuItem.getPrice();
	}

	public String getName() {
		return name;
	}

	public int getPrice() {
		return price;
	}

}
