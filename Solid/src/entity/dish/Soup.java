package entity.dish;


import entity.ingredient.Ingredient;

import java.util.ArrayList;
import java.util.List;

public class Soup implements IDish {
	private List<Ingredient> ingredients;
	
	private String name;

	public Soup() {
		ingredients = new ArrayList<>();
	}

	public Soup(List<Ingredient> ingredients, String name) {
		this.ingredients = ingredients;
		this.name = name;
	}

	@Override
	public void setIngredients(List<Ingredient> ingredients) {
		this.ingredients = ingredients;
	}

	@Override
	public void addIngredient(Ingredient ingredient) {
		ingredients.add(ingredient);
	}

	@Override
	public List<Ingredient> getIngredients() {
		return ingredients;
	}

	@Override
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String getName() {
		return name;
	}

	public void setName(DishType type) {
		name = type.getDishTypeName();
	}

//	@Override
//	public void prepare(DishType type) {
//		setName(type);
//		addSpecialIngretients(type);
//		System.out.println("Preparing soup with ingredients: "+ ingredients);
//		System.out.println("I pour water into the pot");
//		System.out.println("I add a stock cube");
//		for(Ingredient ingredient: ingredients) {
//			if(ingredient instanceof Carrot marchewka) {
//				marchewka.obierz();
//				marchewka.pokroj();
//			}
//			if(ingredient instanceof Pasta makaron) {
//				makaron.cook();
//			}
//			if(ingredient instanceof Rice rice) {
//				rice.cook();
//			}
//		}
//	}
//
//	@Override
//	public void serve() {
//		System.out.println("Serving dinner");
//		System.out.println("I serve "+ name + " to the table");
//	}
//
//	@Override
//	public void delivery(Address address) {
//		System.out.println("Delivery dish");
//		System.out.println("I delivery "+ name + " to address " + address.getFullAdress());
//	}
//
//	private void addSpecialIngretients(DishType type) {
//		switch (type) {
//			case CHICKEN_BROTH_WITH_RICE -> addIngredient(new Rice());
//			case CHICKEN_BROTH_WITH_PASTA -> addIngredient(new Pasta());
//		}
//	}
}
