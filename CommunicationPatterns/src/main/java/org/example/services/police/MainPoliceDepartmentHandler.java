package org.example.services.police;

import lombok.AllArgsConstructor;
import org.example.entities.police.MainPoliceDepartment;

@AllArgsConstructor
public class MainPoliceDepartmentHandler extends PoliceChainOfResponsibility {

    private MainPoliceDepartment mainPoliceDepartment;

    @Override
    public boolean handleEvent(PoliceChainOfResponsibility event, String report) {
        if(report.contains("mainPoliceDepartment")) {
            mainPoliceDepartment.acceptTheReport(report);
            return true;
        }
        return postEvent(event, report);
    }
}

