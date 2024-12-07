package edu.sandbox.javalivecodinginterview.javacore.counter;

import lombok.Data;

@Data
public class Counter {

    private final int limit;
    private int value;

    public void increment() {
        for (int i = 0; i < limit; i++) {
            value++;
        }
    }
}
