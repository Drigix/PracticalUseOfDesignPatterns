package org.example.services.decorator;

import org.example.entity.Car;

public class AirConditionOverviewImpl implements IOverview {

    private final BaseOverviewImpl baseOverview = new BaseOverviewImpl();

    @Override
    public void makeOverview(Car c) {
        baseOverview.makeOverview(c);
        changeSparkPlugs(c);
        changeAirCondition(c);
    }

    @Override
    public void changeOil(Car c) {
        baseOverview.changeOil(c);
    }

    @Override
    public void changeFilters(Car c) {
        baseOverview.changeFilters(c);
    }

    private void changeSparkPlugs(Car c) {
        System.out.println("Change spark plugs in "+c);
    }

    private void changeAirCondition(Car c) {
        System.out.println("Change air condition in "+c);
    }
}
