package entity.worker;

import entity.DishOrder;
import entity.customer.Address;

public class Courier implements ICourier {

    @Override
    public void delivery(DishOrder order, Address address) {
        System.out.println("****DELIVERY****");
        System.out.println("Delivery order to address: " + address.getFullAdress());
    }
}
