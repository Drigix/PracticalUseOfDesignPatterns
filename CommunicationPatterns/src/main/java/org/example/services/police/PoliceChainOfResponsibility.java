package org.example.services.police;

import org.example.services.ChainOfResponsibility;

public abstract class PoliceChainOfResponsibility {

    private PoliceChainOfResponsibility nextHandler;

    public void setNextHandler(PoliceChainOfResponsibility handler) {
        this.nextHandler = handler;
    }

    protected abstract boolean handleEvent(PoliceChainOfResponsibility event, String report);

    protected boolean postEvent(PoliceChainOfResponsibility event, String report) {
        if(nextHandler != null) {
            return nextHandler.handleEvent(event, report);
        }
        return false;
    }
}
