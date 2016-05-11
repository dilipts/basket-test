package com.basket.item;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.List;

public class BasketCalculator {

	public BigDecimal calculateTotalCost(Basket basket) {
		BigDecimal totalCost = BigDecimal.ZERO;
		if (null != basket) {
			List<Item> items = basket.getItems();
			if (null != items && !items.isEmpty()) {
				for (Item item : items) {
					totalCost = totalCost.add(item.getBasePrice()
							             .multiply(new BigDecimal(item.getQuantity())));
				}
			}
		}
		return totalCost.setScale(2, RoundingMode.UP);
	}

}
