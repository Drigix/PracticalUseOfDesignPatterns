package org.example.entity.cars;

import static org.example.enums.CarType.CAR;
import static org.example.enums.CarType.TRUCK;

public class Client {
	public static void main(String[] args) {
		new Client();
	}
	public Client() {
		Service service = new Service();
		ICar myCar = service.prepareCar(CAR);
		myCar.test();
		ICar myCar2 = service.prepareCar(TRUCK);
		myCar2.test();
	}
	

}

