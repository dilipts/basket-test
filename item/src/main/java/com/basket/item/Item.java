package com.basket.item;

import java.math.BigDecimal;

public class Item {

	private String name;
	private int quantity;
	private BigDecimal basePrice;

	public Item(String name, int quantity, BigDecimal basePrice) {
		this.name = name;
		this.quantity = quantity;
		this.basePrice = basePrice;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public BigDecimal getBasePrice() {
		return basePrice;
	}

	public void setBasePrice(BigDecimal basePrice) {
		this.basePrice = basePrice;
	}

}
