package org.example.services.decorator;

public class BaseTextVacuum implements ITextVacuum {

    @Override
    public String slice(String text) {
        return "Slice text";
    }
}
