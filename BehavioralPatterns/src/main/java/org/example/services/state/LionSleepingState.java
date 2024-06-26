package org.example.services.state;

import org.example.enums.LionActivities;

public class LionSleepingState implements State{

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
        System.out.println("No reaction");
    }

    private void feed() {
        System.out.println("Start eating");
        this.context.setState(1);
    }

    private void sing() {
        System.out.println("Wake up");
        this.context.setState(2);
    }

    private void take() {
        System.out.println("Nothing to take");
    }
}
