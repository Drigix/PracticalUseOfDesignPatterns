package entity.worker;

import entity.order.DishOrder;
import entity.dish.interfaces.IDish;
import entity.worker.interfaces.IWaiter;

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
