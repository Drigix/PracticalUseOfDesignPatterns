package factory;

import entity.ingredient.*;
import strategy.CarrotPrepare;
import strategy.IIngredientPrepare;
import strategy.PastaPrepare;
import strategy.RicePrepare;

import java.security.InvalidParameterException;

public class IngredientPrepareFactory {

    public static IIngredientPrepare create(Ingredient ingredient) {
        return switch (ingredient.getIngredientType()) {
            case CARROT -> new CarrotPrepare();
            case PASTA -> new PastaPrepare();
            case RICE -> new RicePrepare();
        };
    }
}
