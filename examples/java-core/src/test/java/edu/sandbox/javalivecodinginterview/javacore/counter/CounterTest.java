package edu.sandbox.javalivecodinginterview.javacore.counter;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class CounterTest {

    @Test
    void shouldIncrementCounterToExpectedValue() throws InterruptedException {
        // given
        var limit = 100_000_000;
        var counter = new Counter(limit);

        // when
        var t1 = new Thread(counter::increment);
        var t2 = new Thread(counter::increment);
        var t3 = new Thread(counter::increment);

        t1.start();
        t2.start();
        t3.start();

        t1.join();
        t2.join();
        t3.join();

        // then
        assertThat(counter)
                .extracting(Counter::getValue)
                .isEqualTo(300_000_000);
    }
}