package com.benguo.Bridge;

/**
 * �Ž�ģʽ     ----- ������ʵ�ּ��Ž�
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
