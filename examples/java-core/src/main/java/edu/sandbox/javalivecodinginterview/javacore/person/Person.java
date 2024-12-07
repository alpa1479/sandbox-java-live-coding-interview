package edu.sandbox.javalivecodinginterview.javacore.person;

import lombok.Data;

@Data
public class Person {

    private final long id;
    private final String name;
    private final String city;
    private final int age;

    public boolean isAdult() {
        return age > 18;
    }
}
