package org.example.services.state;

import org.example.enums.LionActivities;

public class LionEatingState implements State {

    private LionStateContext context;

    @Override
    public void execute(LionStateContext context, LionActivities activity) {
        this.context = context;
        switch (activity) {
            case HOOK -> hook();
            case FEED -> feed();
            case SING -> sing();
            case TAKE -> take();
        }
    }

    private void hook() {
        System.out.println("Aghrrrrrr");
    }

    private void feed() {
        System.out.println("Start eating");
        this.context.setState(1);
    }

    private void sing() {
        System.out.println("Aghrrrrrr");
    }

    private void take() {
        System.out.println("Take food");
        this.context.setState(2);
    }
}
