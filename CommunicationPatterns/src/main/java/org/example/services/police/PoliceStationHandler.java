package org.example.services.police;

import lombok.AllArgsConstructor;
import org.example.entities.police.PoliceStation;

@AllArgsConstructor
public class PoliceStationHandler extends PoliceChainOfResponsibility {

    private PoliceStation policeStation;
    @Override
    public boolean handleEvent(PoliceChainOfResponsibility event, String report) {
        if(report.contains("policestation")) {
            policeStation.acceptTheReport(report);
            return true;
        }
        return postEvent(event, report);
    }

}
