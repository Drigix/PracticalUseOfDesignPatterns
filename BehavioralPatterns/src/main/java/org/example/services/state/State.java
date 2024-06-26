package org.example.services.state;

import org.example.enums.LionActivities;

public interface State {
    void execute(LionStateContext context, LionActivities activity);
}
