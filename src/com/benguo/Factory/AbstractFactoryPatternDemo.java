package com.benguo.Factory;

/**
 * ≤‚ ‘≥ÈœÛπ§≥ß
 * @author hubeiping
 *
 */
public class AbstractFactoryPatternDemo {
	
	public static void main(String[] args) {
		
		AbstractFactory factory = FactoryProducer.getFactory("color");
		Color color = factory.getColor("red");
		color.fill();
		Color color1 = factory.getColor("blue");
		color1.fill();
		Color color2 = factory.getColor("green");
		color2.fill();
		
		AbstractFactory factory1 = FactoryProducer.getFactory("shape");
		
		Shape shape = factory1.getShape("square");
		shape.draw();
		Shape shape1 = factory1.getShape("rectangle");
		shape1.draw();
		Shape shape2 = factory1.getShape("circle");
		shape2.draw();
		 
		
	}

}
