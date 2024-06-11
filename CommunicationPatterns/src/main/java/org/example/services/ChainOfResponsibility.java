package org.example.services;

public abstract class ChainOfResponsibility {
    private ChainOfResponsibility nextHandler;

    public void setNextHandler(ChainOfResponsibility handler) {
        this.nextHandler = handler;
    }

    protected abstract boolean handleEvent(ChainOfResponsibility event);

    protected boolean postEvent(ChainOfResponsibility event) {
        if(nextHandler != null) {
            return nextHandler.handleEvent(event);
        }
        return false;
    }
}
