package com.abhi.java8features.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamGroup {

	public static void main(String[] args) {
		
		List<Fruit> items = Arrays.asList(
				    new Fruit("apple",80.50f,  10 ),
	                new Fruit("banana", 13.8f, 20),
	                new Fruit("orange", 43.1f, 10),
	                new Fruit("watermelon", 23.56f, 34),
	                new Fruit("papaya",21.67f, 20 ),
	                new Fruit("apple", 80.50f,10 ),
	                new Fruit("banana", 13.8f, 8),
	                new Fruit("banana", 13.8f, 28),
	                new Fruit("orange", 43.1f, 15),
	                new Fruit("watermelon", 23.56f, 34),
	                new Fruit("apple",80.50f, 20)
				);
		
		// counting the occurrence of  each name
		Map<String, Long> counting =  items.stream()
				.collect(Collectors.groupingBy(Fruit :: getName, Collectors.counting()));
		System.out.println("Count : " + counting);
		
		// sum of quantity for each group.
		Map<String, Integer> sumOfQty = items.stream()
				.collect(Collectors.groupingBy(Fruit:: getName, Collectors.summingInt(Fruit:: getQuantity)));
		System.out.println("Sum of Qty :"+ sumOfQty);
		
		
		//find the average qty  purchased for each item
		Map<String, Double> avgOfQty  = items.stream()
				.collect(Collectors.groupingBy(Fruit::getName, Collectors.averagingInt(Fruit :: getQuantity)));
		System.out.println("avgOfQty :" + avgOfQty);
		
		

	}

}

class Fruit
{
	String name;
	float price;
	int quantity;
	
	
	public Fruit(String name, float price, int quantity) {
		super();
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the price
	 */
	public float getPrice() {
		return price;
	}
	/**
	 * @param price the price to set
	 */
	public void setPrice(float price) {
		this.price = price;
	}
	/**
	 * @return the quantity
	 */
	public int getQuantity() {
		return quantity;
	}
	/**
	 * @param quantity the quantity to set
	 */
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	
}
