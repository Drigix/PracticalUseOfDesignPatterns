package org.example.services.strategy;

import org.example.entity.Car;

public class DieselStrategyOverviewImpl implements IStrategyOverview {

    @Override
    public void makeOverview(Car c) {
        System.out.println("Starting car overview "+c);
        changeOil(c);
        changeFilters(c);
        checkingTirePressure(c);
        System.out.println("Overview car "+c+" end");
    }

    @Override
    public void changeOil(Car c) {
        System.out.println("Change oil in "+c);
    }

    @Override
    public void changeFilters(Car c) {
        System.out.println("Change filters in "+c);
    }

    private void checkingTirePressure(Car c) { System.out.println("Checking tire pressure "+c); }
}
