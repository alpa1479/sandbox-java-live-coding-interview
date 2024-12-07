package edu.sandbox.javalivecodinginterview.javacore.account;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

import static org.assertj.core.api.Assertions.assertThat;

class AccountTest {

    @Test
    void shouldCheckThatSameAccountAlreadyExists() {
        // given
        Set<Account> accounts = new HashSet<>();

        var first = new Account(1, BigDecimal.ONE);
        var second = new Account(2, BigDecimal.TWO);
        var third = new Account(3, BigDecimal.TEN);

        accounts.add(first);
        accounts.add(second);
        accounts.add(third);

        // when
        first.setBalance(BigDecimal.ZERO);

        // then
        assertThat(
                accounts.contains(first)
        ).isTrue();
    }
}