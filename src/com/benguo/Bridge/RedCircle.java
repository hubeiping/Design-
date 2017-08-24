package com.benguo.Bridge;

public class RedCircle implements DrawAPI {

	@Override
	public void drawCircle(int radius, int x, int y) {
		// TODO Auto-generated method stub
		System.out.println("画一个红色的圆:半径:"+radius+" x坐标:"+x+" y坐标:"+y);
	}

}
