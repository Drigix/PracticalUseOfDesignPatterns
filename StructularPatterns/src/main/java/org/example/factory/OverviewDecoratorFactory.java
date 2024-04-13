package org.example.factory;

import org.example.enums.OverviewType;
import org.example.services.decorator.AirConditionOverviewImpl;
import org.example.services.decorator.DieselOverviewImpl;
import org.example.services.decorator.IOverview;
import org.example.services.decorator.NormalOverviewImpl;

public class OverviewDecoratorFactory {

    public static IOverview create(OverviewType type) {
        return switch (type) {
            case NORMAL -> new NormalOverviewImpl();
            case AIR_CONDITION -> new AirConditionOverviewImpl();
            case DIESEL -> new DieselOverviewImpl();
        };
    }
}
