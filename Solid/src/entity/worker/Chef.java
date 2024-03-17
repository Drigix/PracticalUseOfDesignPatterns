package entity.worker;

import entity.*;
import entity.dish.DishType;
import entity.dish.IDish;
import entity.ingredient.Carrot;
import entity.ingredient.Ingredient;
import entity.ingredient.Pasta;
import entity.ingredient.Rice;

import java.util.List;

import static entity.dish.DishType.CHICKEN_BROTH_WITH_PASTA;

public class Chef implements IChef {

    @Override
    public void prepere(DishOrder order) {
        for(IDish dish: order.getDishes()) {
            DishType[] dishTypes = DishType.values();
            DishType searchType = CHICKEN_BROTH_WITH_PASTA;
            for(DishType dishType: dishTypes) {
                if(dishType.getDishTypeName().equals(dish.getName())) {
                    searchType = dishType;
                }
            }

            switch (searchType) {
                case CHICKEN_BROTH_WITH_PASTA, CHICKEN_BROTH_WITH_RICE -> prepareChickenBroth(dish);
                case TOMATO_SOUP_WITH_PASTA, TOMATO_SOUP_WITH_RICE -> prepareTomatoSoup(dish);
            }
            prepareIngredients(dish.getIngredients());
        }
    }

    private void prepareChickenBroth(IDish dish) {
        System.out.println("Preparing soup with ingredients: " + dish.getIngredients());
        System.out.println("I pour water into the pot");
        System.out.println("I add a stock cube");
    }

    private void prepareTomatoSoup(IDish dish) {
        System.out.println("Preparing soup with ingredients: " + dish.getIngredients());
        System.out.println("I pour water into the pot");
        System.out.println("I add a tomato concentrate");
    }

    private void prepareIngredients(List<Ingredient> ingredients) {
        for(Ingredient ingredient: ingredients) {
            if(ingredient instanceof Carrot carrot) {
                carrot.peeling();
                carrot.cutting();
            }
            if(ingredient instanceof Pasta pasta) {
                pasta.cook();
            }
            if(ingredient instanceof Rice rice) {
                rice.cook();
            }
        }
    };

}
