package org.example.factory;

import org.example.enums.OverviewType;
import org.example.services.template.AirConditionOverviewImpl;
import org.example.services.template.DieselOverviewImpl;
import org.example.services.template.NormalOverviewImpl;
import org.example.services.template.OverviewTemplateMethod;

public class OverviewTemplateMethodFactory {

    public static OverviewTemplateMethod create(OverviewType type) {
        return switch (type) {
            case NORMAL -> new NormalOverviewImpl();
            case AIR_CONDITION -> new AirConditionOverviewImpl();
            case DIESEL -> new DieselOverviewImpl();
        };
    }
}
