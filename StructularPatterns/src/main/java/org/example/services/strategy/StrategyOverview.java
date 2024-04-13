package org.example.services.strategy;

import org.example.entity.Car;
import org.example.services.decorator.IOverview;

public class StrategyOverview {

    public static void makeOverview(IOverview overview, Car c) {
        overview.makeOverview(c);
    }

}
