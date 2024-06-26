package org.example.services.state;

import org.example.enums.LionActivities;

public class LionWalkingState implements State {

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
        System.out.println("He throws himself");
    }

    private void feed() {
        System.out.println("Start eating");
        this.context.setState(1);
    }

    private void sing() {
        System.out.println("Falls asleep");
        this.context.setState(0);
    }

    private void take() {
        System.out.println("Nothing to take");
    }
}
