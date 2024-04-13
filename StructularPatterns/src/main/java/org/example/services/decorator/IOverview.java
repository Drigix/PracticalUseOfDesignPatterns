package org.example.services.decorator;

import org.example.entity.Car;

public interface IOverview {
    void makeOverview(Car c);
    void changeOil(Car c);
    void changeFilters(Car c);
}
