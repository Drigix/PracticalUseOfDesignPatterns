package org.example.services.template;

import java.util.HashMap;
import java.util.Map;

public abstract class StatisticaTemplateMethod {

    protected Map<String, Integer> resultMap = new HashMap<>();

    public Map<String, Integer> executeAll(String text) {
        return resultMap;
    }
}
