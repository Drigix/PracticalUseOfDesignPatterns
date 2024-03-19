package entity.worker.interfaces;

import entity.order.DishOrder;

public interface IWaiter {
    void serve(DishOrder order);

    void coverTable();

    void collectDishes();
}
