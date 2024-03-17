package entity;

import entity.dish.IDish;

import java.util.List;

public class DishOrder {

    private List<IDish> dishes;

    private DishOrderType type;


    public DishOrder(List<IDish> dishes, DishOrderType type) {
        this.dishes = dishes;
        this.type = type;
    }

    public List<IDish> getDishes() {
        return dishes;
    }

    public void setDishes(List<IDish> dishes) {
        this.dishes = dishes;
    }

    public DishOrderType getType() {
        return type;
    }

    public void setType(DishOrderType type) {
        this.type = type;
    }
}
