package org.example.linkedlist;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class LinkedListTask2Test {
    @ParameterizedTest
    @MethodSource("provideTestCases")
    @DisplayName("Should get kth node")
    void shouldGetKthNode(int[] inputArr, int k,int expectedResult) {
        // Given
        Node head = new Node(inputArr);

        // When
        Node actualResult = LinkedListTask2.getKthTail(head, k);

        // Then
        Assertions.assertEquals(expectedResult, actualResult.value);
    }

    private static Stream<Arguments> provideTestCases() {
        return Stream.of(
                Arguments.of(new int[] {1,2,3,4,5}, 2, 4),
                Arguments.of(new int[] {1,2,3,4,5}, 4, 2),
                Arguments.of(new int[] {1}, 1, 1)
        );
    }
}