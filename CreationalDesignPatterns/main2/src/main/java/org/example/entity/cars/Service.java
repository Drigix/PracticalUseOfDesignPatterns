package org.example.entity.cars;

import org.example.enums.CarType;
import org.example.factory.CarFactory;

public class Service {
	public ICar prepareCar(CarType carType) {
		ICar car = CarFactory.createCar(carType);
		car.checkFluids();
		car.fuelUp();
		return car;
	}
}
