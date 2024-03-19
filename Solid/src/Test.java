import entity.order.DishOrder;
import enums.order.enums.DishOrderType;
import entity.customer.Address;
import entity.dish.interfaces.IDish;
import entity.worker.interfaces.IChef;
import entity.worker.interfaces.ICourier;
import entity.worker.interfaces.IWaiter;
import factory.DishFactory;
import entity.worker.*;

import java.util.ArrayList;
import java.util.List;

import static enums.dish.enums.DishType.CHICKEN_BROTH_WITH_PASTA;
import static enums.dish.enums.DishType.TOMATO_SOUP_WITH_RICE;

public class Test {
	public static void main(String[] args) {
		IChef chef = new Chef();
		IWaiter waiter = new Waiter();
		ICourier courier = new Courier();
		prepare(chef, waiter, courier);
	}

	public static void prepare(IChef chef, IWaiter waiter, ICourier courier) {
		List<IDish> dishes = new ArrayList<>();
        dishes.add(DishFactory.create(TOMATO_SOUP_WITH_RICE));
		dishes.add(DishFactory.create(CHICKEN_BROTH_WITH_PASTA));
		DishOrder order = new DishOrder(dishes, DishOrderType.TAKEAWAY);
		chef.prepere(order);
		if(order.getType() == DishOrderType.ON_SITE) {
			waiter.coverTable();
			waiter.serve(order);
			waiter.collectDishes();
		} else if(order.getType() == DishOrderType.TAKEAWAY) {
			Address address = new Address("Zwycięstwa", "22", "Gliwice", "42-100");
			courier.delivery(order, address);
		}
	}
}
