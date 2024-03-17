package entity.worker;

import entity.DishOrder;
import entity.customer.Address;

public interface ICourier {

    void delivery(DishOrder order, Address address);
}
