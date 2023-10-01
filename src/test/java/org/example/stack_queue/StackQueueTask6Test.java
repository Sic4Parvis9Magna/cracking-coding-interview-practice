package org.example.stack_queue;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class StackQueueTask6Test {

    @ParameterizedTest
    @MethodSource("provideTestCases")
    @DisplayName("Should sort stack ascending")
    void shouldSortStackAscending(List<Integer> input, List<Integer> output) {
        // Given
        Deque<Integer> inputStack = new LinkedList<>(input);
        Deque<Integer> outputStack = new LinkedList<>(output);

        // When
        StackQueueTask6.sortAscending(inputStack);

        // Then
        Assertions.assertEquals(outputStack, inputStack);
    }

    private static Stream<Arguments> provideTestCases() {
        return Stream.of(
                Arguments.of(List.of(2,1,3,5,4), List.of(5,4,3,2,1)),
                Arguments.of(List.of(1), List.of(1)),
                Arguments.of(List.of(), List.of())
        );
    }
}