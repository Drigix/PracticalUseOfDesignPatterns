package entity.ingredient;

import enums.ingredient.IngridientType;

public class Pasta extends Ingredient {

	@Override
	public String toString() {
		return "pasta";
	}
	
	public void cook() {
		System.out.println("Cook pasta");
	}

	@Override
	public IngridientType getIngredientType() {
		return IngridientType.PASTA;
	}
}
