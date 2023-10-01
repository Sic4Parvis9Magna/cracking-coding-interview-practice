package org.example.stack_queue;

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

class StackQueueTask4Test {

    @ParameterizedTest
    @MethodSource("provideTestCases")
    @DisplayName("Should move disks")
    void shouldMoveDisksRecursively(List<Integer> src) {
        // Given
        Deque<Integer> srcStack = new LinkedList<>(src);
        Deque<Integer> destStack = new LinkedList<>();
        Deque<Integer> tmpStack = new LinkedList<>();
        // When
        StackQueueTask4.moveDisksRecursively(srcStack, destStack, tmpStack);

        // Then
        assertTrue(srcStack.isEmpty());
        assertTrue(tmpStack.isEmpty());
        assertEquals(new LinkedList<>(src), destStack);
    }

    private static Stream<Arguments> provideTestCases() {
        return Stream.of(
                Arguments.of(List.of(5,4,3,2,1)),
                Arguments.of(List.of(1), List.of(1)),
                Arguments.of(List.of(), List.of())
        );
    }
}