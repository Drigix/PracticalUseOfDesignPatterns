package org.example.services.police;

import lombok.AllArgsConstructor;
import org.example.entities.police.District;

@AllArgsConstructor
public class DistrictHandler extends PoliceChainOfResponsibility {

    private District district;

    @Override
    public boolean handleEvent(PoliceChainOfResponsibility event, String report) {
        if(report.contains("district")) {
            district.acceptTheReport(report);
            return true;
        }
        return postEvent(event, report);
    }
}
