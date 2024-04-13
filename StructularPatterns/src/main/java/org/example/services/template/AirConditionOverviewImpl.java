package org.example.services.template;

import org.example.entity.Car;

public class AirConditionOverviewImpl extends OverviewTemplateMethod {

    @Override
    public void makeOverview(Car c) {
        System.out.println("Starting car overview "+c);
        super.makeOverview(c);
        changeSparkPlugs(c);
        changeAirCondition(c);
        System.out.println("Overview car "+c+" end");
    }

    private void changeAirCondition(Car c) { System.out.println("Change air condition in "+c); }
}
