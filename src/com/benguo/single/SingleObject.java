package com.benguo.single;

/**
 * 
 * ���ģʽ------����
 * @author hubeiping
 *
 */
public class SingleObject {
	
	private  volatile static SingleObject singleObject ;
	
	private  SingleObject(){
		
		
	}
	
	public static  SingleObject getSingleObject(){
		synchronized (SingleObject.class){
			if(singleObject == null){
				
				singleObject = new SingleObject();
			}
		}
		
		return singleObject;
		
	} 
	
	public void showMessage() {
		// TODO Auto-generated method stub
		System.out.println("����singleObject..................");
	}

}
