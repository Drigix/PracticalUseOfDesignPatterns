package org.example.services;

import lombok.AllArgsConstructor;
import org.example.entities.Auction;

@AllArgsConstructor
public class ActionHandler extends ChainOfResponsibility {

    private Auction auction;

    @Override
    public boolean handleEvent(ChainOfResponsibility event) {
        if(event instanceof ActionHandler) {
            return true;
        }
        return postEvent(event);
    }
}
