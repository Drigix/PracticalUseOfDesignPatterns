package entity.ingredient;

import enums.ingredient.IngridientType;

public class Carrot extends Ingredient {

	public String toString() {
		return "carrot";
	}
	public void peeling() {
		System.out.println("Peeling carrot");
	}
	public void cutting() {
		System.out.println("Cutting marchewki");
	}

	@Override
	public IngridientType getIngredientType() {
		return IngridientType.CARROT;
	}
}
