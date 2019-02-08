package com.juyoung.tdd.demo.junit.pojo;

import java.util.Random;

public class RandomCalculator {
    private Random random;
    private Calcurator calcurator;

    public RandomCalculator(Random random, Calcurator calcurator) {
        this.random = random;
        this.calcurator = calcurator;
    }

    public int plus(int... targets) {
        return this.calcurator.plus(targets) + random.nextInt();
    }
}
