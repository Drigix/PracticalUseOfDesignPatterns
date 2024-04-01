package org.example.instance;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class AbacusPool {

    private static List<AbacusPool> pool = new ArrayList<>();

    private static final int maxSize = 3;

    static {
        for (int i = 0; i < maxSize; i++) {
            AbacusPool abacusPool = new AbacusPool();
            pool.add(abacusPool);
        }
    }

    private boolean isFree = true;

    public static AbacusPool getInstance() {
        Optional<AbacusPool> abacusPool = pool.stream().filter(p -> p.isFree).findFirst();
        if (abacusPool.isPresent()) {
            abacusPool.get().isFree = false;
            return abacusPool.get();
        }
        return null;
    }

    public void free() {
        isFree = true;
    }

    public void count1() {
        System.out.println("Do count1");
    }

    public void count2() {
        System.out.println("Do count2");
    }
}
