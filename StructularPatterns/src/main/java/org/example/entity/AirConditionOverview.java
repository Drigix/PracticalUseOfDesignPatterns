package org.example.entity;

public class AirConditionOverview implements IOverview {

    @Override
    public void makeOverview(Car s) {
        System.out.println("Starting car overview "+s);
        changeOil(s);
        changeFilters(s);
        changeAirCondition(s);
        System.out.println("Overview car "+s+" end");
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
        System.out.println("Change air codition in "+c);
    }
}
