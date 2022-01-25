package CoffeeShop;

import java.util.List;

public class 메뉴판 {

	private List<메뉴아이템> items;

	public 메뉴판(List<메뉴아이템> items) {
		this.items = items;
	}

	public 메뉴아이템 choose(String menuName) {
		for (메뉴아이템 item : items) { // 4개
			if (item.getName().equals(menuName)) {
				return item;
			}
		}

		return null;
	}
}
