package com.basket.item;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;

import junit.framework.TestCase;

public class BasketCalculatorTest extends TestCase {
	
	private BasketCalculator basketCalculator;

	protected void setUp() throws Exception {
		super.setUp();
		basketCalculator = new BasketCalculator();
	}
	
	public void testBasketCalculateForNull(){
		Basket basket = null;
		BigDecimal basketPrice = basketCalculator.calculateTotalCost(basket);
		assertEquals(BigDecimal.ZERO.setScale(2, RoundingMode.UP), basketPrice);
	}
	
	public void testBasketCalculateForEmpty(){
		Basket basket = new Basket();
		BigDecimal basketPrice = basketCalculator.calculateTotalCost(basket);
		assertEquals(BigDecimal.ZERO.setScale(2, RoundingMode.UP), basketPrice);
	}
	
	public void testBasketCalculate(){
		Basket basket = createBasket();
		BigDecimal basketPrice = basketCalculator.calculateTotalCost(basket);
		assertNotNull(basketPrice);
		BigDecimal expectedPrice = new BigDecimal(4.00).setScale(2, RoundingMode.UP);
		assertEquals(expectedPrice, basketPrice);
	}
	private Basket createBasket() {
		Item banana = new Item("Banana", 6, new BigDecimal(0.10));
		Item orange = new Item("Orange", 2, new BigDecimal(0.20));
		Item apple = new Item("Apple", 6, new BigDecimal(0.25));
		Item lemon = new Item("Lemon", 2, new BigDecimal(0.15));
		Item peach = new Item("Peach", 4, new BigDecimal(0.30));
		List<Item> items = new ArrayList<Item>();
		items.add(banana);
		items.add(orange);
		items.add(apple);
		items.add(lemon);
		items.add(peach);
		Basket basket = new Basket();
		basket.setItems(items);
		return basket;
	}


	protected void tearDown() throws Exception {
		super.tearDown();
		basketCalculator = null;
	}

}
