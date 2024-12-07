package edu.sandbox.javalivecodinginterview.javacore.account;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
public class Account {

    private final long id;
    private BigDecimal balance;
}
