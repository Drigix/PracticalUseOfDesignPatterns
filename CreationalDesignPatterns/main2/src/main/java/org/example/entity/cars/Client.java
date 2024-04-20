package org.example.entity.cars;

import org.example.entity.invoice.Invoice;

import static org.example.enums.CarType.CAR;
import static org.example.enums.CarType.TRUCK;

public class Client {
	public static void main(String[] args) {
		new Client();
	}
	public Client() {

		ICar car = new CarService().prepareCar();
		car.test();

		ICar car2 = new TruckService().prepareCar();
		car2.test();

//		Service service = new Service();
//		ICar myCar = service.prepareCar(CAR);
//		myCar.test();
//		ICar myCar2 = service.prepareCar(TRUCK);
//		myCar2.test();
	}
	

}

