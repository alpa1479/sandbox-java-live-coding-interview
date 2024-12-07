package edu.sandbox.javalivecodinginterview.javacore.error;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum Error {

    E_2234(1),
    E_7264(2),
    E_7262(2),
    E_9134(3),
    E_1334(4),
    E_7834(5);

    private final int priority;
}
