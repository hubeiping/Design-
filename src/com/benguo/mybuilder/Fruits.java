package com.benguo.mybuilder;

/**
 * ˮ��������
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
