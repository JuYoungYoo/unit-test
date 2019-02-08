package com.juyoung.tdd.demo.junit.pojo;

import java.util.Arrays;

public class Calcurator {
    public int plus(int tar1, int tar2) {
        return tar1 + tar2;
    }

    public int plus(int... targets) {
        return Arrays.stream(targets).sum();
    }
}
