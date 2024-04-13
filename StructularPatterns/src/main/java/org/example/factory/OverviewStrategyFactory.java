package org.example.factory;

import org.example.enums.OverviewType;
import org.example.services.strategy.AirConditionStrategyOverviewImpl;
import org.example.services.strategy.DieselStrategyOverviewImpl;
import org.example.services.strategy.IStrategyOverview;
import org.example.services.strategy.NormalStrategyOverviewImpl;


public class OverviewStrategyFactory {

    public static IStrategyOverview create(OverviewType type) {
        return switch (type) {
            case NORMAL -> new NormalStrategyOverviewImpl();
            case AIR_CONDITION -> new AirConditionStrategyOverviewImpl();
            case DIESEL -> new DieselStrategyOverviewImpl();
        };
    }
}
