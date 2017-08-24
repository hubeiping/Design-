package com.benguo.Bridge;

public class Circle extends Shape {
	
	private  int x,y,radius;

	public Circle(int x,int y,int radius,DrawAPI drawAPI) {
		super(drawAPI);
		// TODO Auto-generated constructor stub
		this.x = x;
		this.y = y;
		this.radius = radius;
	}

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		drawAPI.drawCircle(radius, x, y);
	}

}
