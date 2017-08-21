package com.benguo.Factory;

/**
 * 定义一个创建对象的接口,让其子类自己决定实例化哪一个工厂类，工厂模式使其创建过程延迟到子类进行。
 * 处理接口选择
 * @author hubeiping
 *
 */
public interface Shape {
	
	void draw();

}
