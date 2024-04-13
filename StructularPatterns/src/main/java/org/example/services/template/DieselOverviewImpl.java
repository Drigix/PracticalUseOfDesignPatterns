package org.example.services.template;

import org.example.entity.Car;

public class DieselOverviewImpl extends OverviewTemplateMethod {

    @Override
    public void makeOverview(Car c) {
        System.out.println("Starting car overview "+c);
        super.makeOverview(c);
        System.out.println("Overview car "+c+" end");
    }
}
