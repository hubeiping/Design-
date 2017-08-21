package com.benguo.builder;

public class MealBuilder {
	
	public Model prepareVegMeal(){
		
		Model meal = new Model();
		meal.addItem(new VegBurger());
		meal.addItem(new Coke());
		return meal;
		
	}
	
	public Model prepareNonVegMeal(){
		
		Model meal = new Model();
		meal.addItem(new ChickenBurger());
		meal.addItem(new Pepsi());
		return meal;
		
	}

}
