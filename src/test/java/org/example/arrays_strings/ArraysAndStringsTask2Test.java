package org.example.arrays_strings;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class ArraysAndStringsTask2Test {

    @ParameterizedTest
    @MethodSource("provideTestCases")
    @DisplayName("Should check if sting is permutation")
    void shouldReverseArray(String input, String expectedResult) {
        // Given
        char[] inputArr = new char[input.length()];
        input.getChars(0, input.length(), inputArr, 0);

        // When
        ArraysAndStringsTask2.reverse(inputArr);
        String actualResult = String.valueOf(inputArr);

        // Then
        Assertions.assertEquals(expectedResult, actualResult);
    }

    private static Stream<Arguments> provideTestCases() {
        return Stream.of(
                Arguments.of("foobar", "raboof"),
                Arguments.of("abcd", "dcba")
        );
    }
}