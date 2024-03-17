package entity.dish.factory;

import entity.dish.DishType;
import entity.dish.IDish;
import entity.dish.Soup;
import entity.dish.TomatoSoup;
import entity.ingredient.Carrot;
import entity.ingredient.Ingredient;
import entity.ingredient.Pasta;
import entity.ingredient.Rice;

import java.util.ArrayList;
import java.util.List;

public class DishFactory {

    public static IDish create(DishType type) {
        List<Ingredient> ingredients = new ArrayList<>();
        switch (type) {
            case CHICKEN_BROTH_WITH_PASTA -> {
                ingredients.add(new Carrot());
                ingredients.add(new Pasta());
                return new Soup(ingredients, type.getDishTypeName());
            }
            case CHICKEN_BROTH_WITH_RICE -> {
                ingredients.add(new Carrot());
                ingredients.add(new Rice());
                return new Soup(ingredients, type.getDishTypeName());
            }
            case TOMATO_SOUP_WITH_PASTA -> {
                ingredients.add(new Carrot());
                ingredients.add(new Pasta());
                return new TomatoSoup(ingredients, type.getDishTypeName());
            }
            case TOMATO_SOUP_WITH_RICE -> {
                ingredients.add(new Carrot());
                ingredients.add(new Rice());
                return new TomatoSoup(ingredients, type.getDishTypeName());
            }
            default -> throw new RuntimeException();
        }
    }
}
