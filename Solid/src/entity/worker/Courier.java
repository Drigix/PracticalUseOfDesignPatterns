package entity.worker;

import entity.order.DishOrder;
import entity.customer.Address;
import entity.worker.interfaces.ICourier;

public class Courier implements ICourier {

    @Override
    public void delivery(DishOrder order, Address address) {
        System.out.println("****DELIVERY****");
        System.out.println("Delivery order to address: " + address.getFullAdress());
    }
}
