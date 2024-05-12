package org.example.entity.cars;

public class TruckService extends Service{
    @Override
    ICar create() {
        return new Truck();
    }
}
