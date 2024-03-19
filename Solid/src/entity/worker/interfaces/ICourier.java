package entity.worker.interfaces;

import entity.order.DishOrder;
import entity.customer.Address;

public interface ICourier {

    void delivery(DishOrder order, Address address);
}
