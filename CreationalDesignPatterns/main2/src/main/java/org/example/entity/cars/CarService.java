package org.example.entity.cars;

public class CarService extends Service{
    @Override
    ICar create() {
        return new Car();
    }
}
