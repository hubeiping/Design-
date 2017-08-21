package com.benguo.builder;

public class BuilderPatternDemo {
	
	public static void main(String[] args) {
		
		MealBuilder mealBuilder = new MealBuilder();
		Model vegMeal = mealBuilder.prepareVegMeal();
		System.out.println("veg Meal");
		vegMeal.showItem();
		System.out.println("vegMeal total : " + vegMeal.getCode());
		
		Model nonVegMeal = mealBuilder.prepareNonVegMeal();
		System.out.println("\n\nnonVegMeal");
		nonVegMeal.showItem();
		System.out.println("nonVegMeal total : " + nonVegMeal.getCode());
		
		
		
	}

}
