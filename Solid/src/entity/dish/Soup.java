package entity.dish;


import enums.dish.enums.DishType;
import entity.dish.interfaces.IDish;
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
}
