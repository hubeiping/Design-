package com.benguo.Bridge;

/**
 * 桥接模式     ----- 抽象与实现加桥接
 * @author hubeiping
 *
 */
public class BridgePatternDemo {
	
	public static void main(String[] args) {
		
		Shape shapeg = new Circle(100,100,10,new GreenCircle());
		
		Shape shaper = new Circle(100,100,10,new RedCircle());
		
		shapeg.draw();
		shaper.draw();
		
	}

}
