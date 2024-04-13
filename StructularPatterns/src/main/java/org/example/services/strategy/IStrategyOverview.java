package org.example.services.strategy;

import org.example.entity.Car;

public interface IStrategyOverview {
    void makeOverview(Car c);
    void changeOil(Car c);
    void changeFilters(Car c);
}
