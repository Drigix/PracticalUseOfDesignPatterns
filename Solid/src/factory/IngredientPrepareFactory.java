package factory;

import entity.ingredient.*;
import strategy.CarrotPrepare;
import strategy.IIngredientPrepare;
import strategy.PastaPrepare;
import strategy.RicePrepare;

public class IngredientPrepareFactory {

    public static IIngredientPrepare create(Ingredient ingredient) {
        if(ingredient instanceof Carrot) {
            return new CarrotPrepare();
        } else if(ingredient instanceof Pasta) {
            return new PastaPrepare();
        } else if (ingredient instanceof Rice) {
            return new RicePrepare();
        } else {
            return null;
        }
    }
}
