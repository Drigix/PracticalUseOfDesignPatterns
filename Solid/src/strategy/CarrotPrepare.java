package strategy;

import entity.ingredient.Carrot;
import entity.ingredient.Ingredient;

public class CarrotPrepare implements  IIngredientPrepare{

    @Override
    public void prepare(Ingredient ingredient) {
        Carrot carrot = (Carrot) ingredient;
        carrot.peeling();
        carrot.cutting();
    }
}
