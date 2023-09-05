package org.example.arrays_strings;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class ArraysAndStringsTask3Test {

    @ParameterizedTest
    @MethodSource("provideTestCases")
    @DisplayName("Should check if sting is permutation")
    void shouldCheckIfStingIsPermutation(String s1, String s2, boolean expectedResult) {
        // When
        boolean actualResult = ArraysAndStringsTask3.isPermutationString(s1, s2);

        // Then
        Assertions.assertEquals(expectedResult, actualResult);
    }

    private static Stream<Arguments> provideTestCases() {
        return Stream.of(
                Arguments.of("foobar", "barfoo", true),
                Arguments.of("abcd", "efgh", false)
        );
    }
}