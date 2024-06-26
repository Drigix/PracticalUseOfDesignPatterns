package org.example.services.state;

import org.example.enums.LionActivities;

public class LionStateContext {

    final int SLEEPING = 0;
    final int EATING = 1;
    final int WALKING = 2;
    private int state = WALKING;

    public void setState(int state) {
        this.state = state;
    }

    public void execute(LionActivities activity) {
        State lionState = new LionWalkingState();
        switch (state) {
            case SLEEPING -> lionState= new LionSleepingState();
            case EATING -> lionState = new LionEatingState();
        }
        lionState.execute(this, activity);
    }
}
