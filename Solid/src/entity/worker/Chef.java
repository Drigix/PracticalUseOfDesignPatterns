package entity.worker;

import enums.dish.enums.DishType;
import entity.dish.interfaces.IDish;
import entity.ingredient.*;
import entity.order.DishOrder;
import entity.worker.interfaces.IChef;
import factory.IngredientPrepareFactory;
import strategy.IIngredientPrepare;

import java.util.List;

import static enums.dish.enums.DishType.CHICKEN_BROTH_WITH_PASTA;

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
            IIngredientPrepare ingredientPrepare = IngredientPrepareFactory.create(ingredient);
            ingredientPrepare.prepare(ingredient);
        }
    }
}
