package entity.ingredient;

import enums.ingredient.IngridientType;

public class Rice extends Ingredient {

    @Override
    public String toString() {
        return "rice";
    }

    public void cook() {
        System.out.println("Cook rice");
    }

    @Override
    public IngridientType getIngredientType() {
        return IngridientType.RICE;
    }
}
