package org.example.factory;

import org.example.entity.cars.Car;
import org.example.entity.cars.ICar;
import org.example.entity.cars.Truck;
import org.example.enums.CarType;

public class CarFactory {

    public static ICar createCar(CarType carType) {
        return switch (carType) {
            case CAR -> new Car();
            case TRUCK -> new Truck();
        };
    }
}
