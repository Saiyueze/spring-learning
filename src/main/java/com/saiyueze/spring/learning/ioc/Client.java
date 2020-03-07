package com.saiyueze.spring.learning.ioc;

public class Client {

	public static void main(String[] args) {
		Fruit fruit = Factory.getInstance("com.saiyueze.spring.learning.ioc.Apple");
		if (fruit != null) {
			fruit.eat();
		}
	}

}
