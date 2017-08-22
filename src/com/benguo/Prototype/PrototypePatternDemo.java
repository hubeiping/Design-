package com.benguo.Prototype;

public class PrototypePatternDemo {
	
	public static void main(String[] args) {
		
		ShapeCache.loadCache();
		
		Shape shapeCircle = ShapeCache.getShape("1");
		shapeCircle.draw();
		System.out.println("Shape: " + shapeCircle.getType());
		
		Shape shapeSquare = ShapeCache.getShape("2");
		shapeSquare.draw();
		System.out.println("Shape: " + shapeSquare.getType());
		
		Shape shapeRectangle = ShapeCache.getShape("3");
		shapeRectangle.draw();
		System.out.println("Shape: " + shapeRectangle.getType());
		
		
	}

}
