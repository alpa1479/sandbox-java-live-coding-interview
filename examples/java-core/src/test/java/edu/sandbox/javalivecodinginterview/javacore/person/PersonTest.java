package edu.sandbox.javalivecodinginterview.javacore.person;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.assertj.core.api.Assertions.assertThat;

class PersonTest {

    @Test
    void shouldCreateValidMapWithAdultPeopleByCityName() {
        // given
        var people = Arrays.asList(
                new Person(1, "name_1", "city_1", 15),
                new Person(2, "name_2", "city_2", 25),
                new Person(3, "name_3", "city_1", 17),
                new Person(4, "name_4", "city_3", 30),
                new Person(5, "name_5", "city_3", 22),
                new Person(6, "name_6", "city_4", 20),
                null,
                new Person(7, "name_7", "city_3", 34)
        );

        // when
        Map<String, List<Person>> adultPeopleByCityNameMap = new HashMap<>();

        // then
        assertThat(adultPeopleByCityNameMap)
                .isNotEmpty()
                .doesNotContainKey("city_1")
                .hasEntrySatisfying("city_2", list -> Assertions.assertThat(list).hasSize(1))
                .hasEntrySatisfying("city_3", list -> Assertions.assertThat(list).hasSize(3))
                .hasEntrySatisfying("city_4", list -> Assertions.assertThat(list).hasSize(1));
    }
}