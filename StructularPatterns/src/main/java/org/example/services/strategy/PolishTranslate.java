package org.example.services.strategy;

public class PolishTranslate implements ITranslate {

    @Override
    public String translate(String text) {
        return "Polski tłumacz";
    }
}
