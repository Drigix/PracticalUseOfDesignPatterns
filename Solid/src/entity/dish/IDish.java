package entity.dish;

import entity.ingredient.Ingredient;

import java.util.List;

public interface IDish {

    void setIngredients(List<Ingredient> ingredients);

    void addIngredient(Ingredient ingredient);

    List<Ingredient> getIngredients();

    void setName(String name);

    String getName();
}
