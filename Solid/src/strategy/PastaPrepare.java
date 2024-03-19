package strategy;

import entity.ingredient.Ingredient;
import entity.ingredient.Pasta;

public class PastaPrepare implements IIngredientPrepare {
    @Override
    public void prepare(Ingredient ingredient) {
        Pasta pasta = (Pasta) ingredient;
        pasta.cook();
    }
}
