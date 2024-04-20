package org.example.services.template;

import org.example.entity.Car;

public class NormalOverviewImpl extends OverviewTemplateMethod {

//    @Override
//    public void makeOverview(Car c) {
//        System.out.println("Starting car overview "+c);
//        super.makeOverview(c);
//        changeSparkPlugs(c);
//        System.out.println("Overview car "+c+" end");
//    }

    @Override
    void makeCustomOverview(Car c) {
        changeSparkPlugs(c);
    }
}
