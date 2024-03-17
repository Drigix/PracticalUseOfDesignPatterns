package entity.worker;

import entity.DishOrder;
import entity.dish.IDish;

public class Waiter implements IWaiter {

    @Override
    public void serve(DishOrder order) {
		System.out.println("****SERVING DINNER****");
        for(IDish dish: order.getDishes()) {
            System.out.println("I serve "+ dish.getName() + " to the table");
        }
    }

    @Override
    public void coverTable() {
        System.out.println("Cover table!");
    }

    @Override
    public void collectDishes() {
        System.out.println("Collect dishes!");
    }
}
