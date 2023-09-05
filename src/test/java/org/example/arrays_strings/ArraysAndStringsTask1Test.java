package org.example.arrays_strings;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class ArraysAndStringsTask1Test {

    @ParameterizedTest
    @MethodSource("provideTestCases")
    @DisplayName("Should validate input")
    void shouldValidateInput(String input, boolean expectedResult) {
        // When
        boolean actualResult = ArraysAndStringsTask1.hasAllUnique(input);

        // Then
        Assertions.assertEquals(expectedResult, actualResult);
    }

    private static Stream<Arguments> provideTestCases() {
        return Stream.of(
                Arguments.of("foobar", false),
                Arguments.of("Hi Mark", true)
        );
    }

}