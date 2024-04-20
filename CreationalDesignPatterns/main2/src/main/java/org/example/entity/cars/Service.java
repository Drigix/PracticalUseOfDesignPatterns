package org.example.entity.cars;

import org.example.enums.CarType;
import org.example.factory.CarFactory;

public abstract class Service {
	public ICar prepareCar() {
//		ICar car = CarFactory.createCar(carType);
		ICar car = create();
		car.checkFluids();
		car.fuelUp();
		return car;
	}

	abstract ICar create();
}
