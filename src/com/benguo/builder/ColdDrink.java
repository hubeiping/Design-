package com.benguo.builder;

/**
 * 
 * @author hubeiping
 *
 */
public abstract class ColdDrink implements Item {


	@Override
	public Packing packing() {
		// TODO Auto-generated method stub
		return new Bottle();
	}

	@Override
	public abstract float price();

}
