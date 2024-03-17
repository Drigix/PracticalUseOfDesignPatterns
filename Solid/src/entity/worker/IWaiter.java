package entity.worker;

import entity.DishOrder;

public interface IWaiter {
    void serve(DishOrder order);

    void coverTable();

    void collectDishes();
}
