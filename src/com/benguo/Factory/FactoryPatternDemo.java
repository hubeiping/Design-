package com.benguo.Factory;

/**
 * ≤‚ ‘π§≥ß
 * @author hubeiping
 *
 */
public class FactoryPatternDemo {
	
	
	public static void main(String[] args) {
		ShapeFactory shapeFactory = new ShapeFactory();
		Shape shape = shapeFactory.getShape("CIRCLE");
		shape.draw();
		Shape shape1 = shapeFactory.getShape("rectangle");
		shape1.draw();
		Shape shape2 = shapeFactory.getShape("square");
		shape2.draw();
	}

}
