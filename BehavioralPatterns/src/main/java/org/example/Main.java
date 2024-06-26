package org.example;

import org.example.entity.Lion;
import org.example.interfaces.ILion;
import org.example.services.state.LionStateContext;

import static org.example.enums.LionActivities.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ILion lew = new Lion();
        System.out.println("==Zaczepiam lwa");
        lew.hook();
        System.out.println("==Karmię lwa");
        lew.feed();
        System.out.println("==Zaczepiam lwa");
        lew.hook();
        System.out.println("==Śpiewam lwu");
        lew.sing();
        System.out.println("==Odbieram lwu jedzenie");
        lew.take();
        System.out.println("==Śpiewam lwu");
        lew.sing();
        System.out.println("==Odbieram lwu jedzenie");
        lew.take();

        LionStateContext lionStateContext = new LionStateContext();
        System.out.println("==Zaczepiam lwa");
        lionStateContext.execute(HOOK);
        System.out.println("==Karmię lwa");
        lionStateContext.execute(FEED);
        System.out.println("==Zaczepiam lwa");
        lionStateContext.execute(HOOK);
        System.out.println("==Śpiewam lwu");
        lionStateContext.execute(SING);
        System.out.println("==Odbieram lwu jedzenie");
        lionStateContext.execute(TAKE);
        System.out.println("==Śpiewam lwu");
        lionStateContext.execute(SING);
        System.out.println("==Odbieram lwu jedzenie");
        lionStateContext.execute(TAKE);
    }
}