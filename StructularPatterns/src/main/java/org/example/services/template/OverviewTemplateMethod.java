package org.example.services.template;

import org.example.entity.Car;

public abstract class OverviewTemplateMethod {

    public void makeOverview(Car c) {
        System.out.println("Starting car overview "+c);
        changeOil(c);
        changeFilters(c);
        checkingTirePressure(c);
        makeCustomOverview(c);
        System.out.println("Overview car "+c+" end");
    }

    abstract void makeCustomOverview(Car c);

    protected void changeOil(Car c) {
        System.out.println("Change oil in "+c);
    }
    protected void changeFilters(Car c) {
        System.out.println("Change filters in "+c);
    }
    protected void changeSparkPlugs(Car c) {
        System.out.println("Change spark plugs in "+c);
    }
    protected void checkingTirePressure(Car c) { System.out.println("Checking tire pressure "+c); }
}
