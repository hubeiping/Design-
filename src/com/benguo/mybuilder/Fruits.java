package com.benguo.mybuilder;

/**
 * 水果抽象类
 * @author hubeiping
 *
 */
public abstract  class Fruits implements Food {

	@Override
	public abstract float total();

	@Override
	public Pack pack() {
		
		// TODO Auto-generated method stub
		return new IcePack();
		
	}

}
