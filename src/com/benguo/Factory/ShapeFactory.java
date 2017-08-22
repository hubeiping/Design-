package com.benguo.Factory;

/**
 * 
 * ¹¤³§
 * @author hubeiping
 *
 */
public class ShapeFactory  extends AbstractFactory{
	

	@Override
	Color getColor(String color) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	Shape getShape(String shape) {
		// TODO Auto-generated method stub
		
		if(shape == null){
			return null;
		}
		if(shape.equalsIgnoreCase("circle")){
			return new Circle();
		}else if(shape.equalsIgnoreCase("rectangle")){
			return new Rectangle();
		}else if(shape.equalsIgnoreCase("square")){
			return new Square();
		}
		
		return null;
	}

}
