package com.factory;

interface Shape {
	void draw();
}

class Square implements Shape {
	@Override
	public void draw() {
		System.out.println("I am a square!");
	}
}

class Rectangle implements Shape {
	@Override
	public void draw() {
		System.out.println("I am a rectangle!");
	}
}

class Circle implements Shape {
	@Override
	public void draw() {
		System.out.println("I am a circle!");
	}
}

class ShapeFactory {
	public Shape getShape(String condition) {
		if (condition.equals("cerc")) {
			return new Circle();
		} else if (condition.equals("patrat")) {
			return new Square();
		}
		return new Rectangle();
	}
}

public class FactoryMain {

	public static void main(String[] args) {
		Shape myShape = new ShapeFactory().getShape("cerc");
		myShape.draw();
	}

}
