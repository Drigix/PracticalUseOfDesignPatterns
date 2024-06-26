package org.example.entity;

import org.example.interfaces.ILion;

public class Lion implements ILion {

    final int SLEEPING=0;
    final int EATING=1;
    final int WALKING=2;
    private int state=WALKING;

    public void hook() {
        if(state==SLEEPING)
            System.out.println("No reaction");
        else if(state==EATING)
            System.out.println("Aghrrrrrr");
        else if(state==WALKING)
            System.out.println("He throws himself");
    }
    public void feed() {
        System.out.println("Start eating");
        state=EATING;
    }
    public void sing() {
        if(state==WALKING) {
            System.out.println("Falls asleep");
            state=SLEEPING;
        }
        else if(state==EATING) {
            System.out.println("Aghrrrrrr");
        }
        else if(state==SLEEPING) {
            System.out.println("Wake up");
            state=WALKING;
        }
    }
    public void take() {
        if(state==EATING) {
            System.out.println("Take food");
            state=WALKING;
        }
        else {
            System.out.println("Nothing to take");
        }
    }
}
