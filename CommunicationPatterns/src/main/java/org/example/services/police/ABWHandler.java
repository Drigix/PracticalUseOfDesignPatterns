package org.example.services.police;

import lombok.AllArgsConstructor;
import org.example.entities.police.ABW;

@AllArgsConstructor
public class ABWHandler extends PoliceChainOfResponsibility {

    private ABW abw;

    @Override
    public boolean handleEvent(PoliceChainOfResponsibility event, String report) {
        if(report.contains("abw")) {
            abw.acceptTheReport(report);
            return true;
        }
        return postEvent(event, report);
    }
}
