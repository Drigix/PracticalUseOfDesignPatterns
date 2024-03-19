package strategy;

import entity.ingredient.Ingredient;
import entity.ingredient.Rice;

public class RicePrepare implements IIngredientPrepare{

    @Override
    public void prepare(Ingredient ingredient) {
        Rice rice = (Rice) ingredient;
        rice.cook();
    }
}
