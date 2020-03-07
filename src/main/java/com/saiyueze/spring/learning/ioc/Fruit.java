package com.saiyueze.spring.learning.ioc;

interface Fruit {
	public abstract void eat();
}

class Apple implements Fruit {
	public void eat() {
		System.out.println("Apple");
	}
}

class Orange implements Fruit {
	public void eat() {
		System.out.println("Orange");
	}
}

class Factory {
	public static Fruit getInstance(String ClassName) {
		Fruit fruit = null;
		try {
			fruit = (Fruit) Class.forName(ClassName).newInstance();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return fruit;
	}
}