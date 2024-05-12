package org.example.services;

import org.example.entity.Item;

import java.util.HashMap;
import java.util.Map;

public class FlyweightPool {

    static Map<String, Item> items = new HashMap<>();

    public static Item getItem(String name, double price) {
        Item item = items.get(name);
        if(item == null) {
            item = new Item(name, price);
            items.put(name, item);
        }
        return item;
    }
}
