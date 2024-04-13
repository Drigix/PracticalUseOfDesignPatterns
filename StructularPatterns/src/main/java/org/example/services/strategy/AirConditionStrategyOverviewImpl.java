package org.example.services.strategy;

import org.example.entity.Car;

public class AirConditionStrategyOverviewImpl implements IStrategyOverview {

    @Override
    public void makeOverview(Car c) {
        System.out.println("Starting car overview "+c);
        changeOil(c);
        changeSparkPlugs(c);
        changeFilters(c);
        changeAirCondition(c);
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

    private void changeSparkPlugs(Car c) {
        System.out.println("Change spark plugs in "+c);
    }
    private void changeAirCondition(Car c) {
        System.out.println("Change air condition in "+c);
    }

    private void checkingTirePressure(Car c) { System.out.println("Checking tire pressure "+c); }
}
