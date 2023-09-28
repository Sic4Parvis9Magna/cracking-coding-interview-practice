package org.example.linkedlist;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class LinkedListTask1Test {

    @ParameterizedTest
    @MethodSource("provideTestCases")
    @DisplayName("Should deduplicate LinkedList")
    void shouldDeduplicateLinkedList(int[] inputArr, int[] expectedResultArr) {
        // Given
        Node input = new Node(inputArr);
        Node expectedResult = new Node(expectedResultArr);

        // When
        Node actualResult = LinkedListTask1.deduplicate(input);

        // Then
        Assertions.assertEquals(expectedResult.toString(), actualResult.toString());
    }

    private static Stream<Arguments> provideTestCases() {
        return Stream.of(
                Arguments.of(new int[] {1,2,3,2,4,1}, new int[] {1,2,3,4}),
                Arguments.of(new int[] {1,1,1,1,1}, new int[] {1}),
                Arguments.of(new int[] {1,2,3}, new int[] {1,2,3})
        );
    }
}