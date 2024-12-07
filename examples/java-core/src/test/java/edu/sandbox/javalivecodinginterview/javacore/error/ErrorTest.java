package edu.sandbox.javalivecodinginterview.javacore.error;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;

class ErrorTest {

    @Test
    void shouldReturnErrorWithHighestPriorityFromServer() {
        // given
        List<String> errorsFromServer = Arrays.asList(
                "E_7834", "E_7264", "S_3364"
        );

        // when
        Optional<Error> errorWithHighestPriority = getErrorWithHighestPriority(errorsFromServer);

        // then
        assertThat(errorWithHighestPriority)
                .isNotEmpty()
                .hasValue(Error.E_7264);
    }

    private Optional<Error> getErrorWithHighestPriority(List<String> errorsFromServer) {
        /// your code is here ...
        return Optional.empty();
    }
}