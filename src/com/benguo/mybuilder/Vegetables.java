package com.benguo.mybuilder;

public abstract class Vegetables implements Food {

	@Override
	public Pack pack() {
		// TODO Auto-generated method stub
		return new HotPack();
	}

	@Override
	public abstract float total();

}
