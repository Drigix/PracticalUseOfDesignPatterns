package org.example.services.decorator;

public class TestConditionTextVacuum implements  ITextVacuum{

    private final BaseTextVacuum baseTextVacuum = new BaseTextVacuum();

    @Override
    public String slice(String text) {
        String result = baseTextVacuum.slice(text);
        return result + "test";
    }
}
