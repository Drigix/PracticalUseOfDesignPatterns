package entity.ingredient;

import enums.ingredient.IngridientType;

public abstract class Ingredient {
	String name;
	int amount;

	public abstract IngridientType getIngredientType();
}
