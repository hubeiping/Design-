package com.benguo.single;

public class SingletonPatternDemo {
	
	public static void main(String[] args) {
		
		SingleObject object = SingleObject.getSingleObject();
		
		object.showMessage();
		
	}

}
