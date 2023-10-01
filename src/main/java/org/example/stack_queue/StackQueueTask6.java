package org.example.stack_queue;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Objects;

/**
 * Write a program to sort a stack in ascending order (with biggest items on top).
 * You may use additional stacks to hold items, but you may not copy the elements into any other data structure (such as an array).
 * The stack supports the following operations: push , pop, peek, and isEmpty
 */
public class StackQueueTask6 {

    /**
     * In memory O(n) as we are using 2 additional stacks for sorting
     * In time O(n^2) as we use bubble sort here(maybe can be impproved with better sorting algorithm)
     */
    public static void sortAscending(Deque<Integer> resultList) {
        if (resultList.isEmpty()) {
            return;
        }

        Deque<Integer> stack1 = new LinkedList<>();
        moveItems(resultList, stack1);
        Deque<Integer> stack2 = new LinkedList<>();
        while (!(stack1.isEmpty() && stack2.isEmpty())) {
            Deque<Integer> src = stack1;
            Deque<Integer> dest = stack2;
            if (stack1.isEmpty()) {
                src = stack2;
                dest = stack1;
            }
            Integer minNumber = getMinNumber(src, dest);
            resultList.push(minNumber);
            removeItem(dest, src, minNumber);
        }
    }

    private static void removeItem(Deque<Integer> src, Deque<Integer> dest, Integer target) {
        while (!src.isEmpty()) {
            Integer nextItem = src.pop();
            if (Objects.equals(nextItem, target)) {
                continue;
            }
            dest.push(nextItem);
        }
    }

    private static Integer getMinNumber(Deque<Integer> src, Deque<Integer> dest) {
        Integer minVal = src.peek();
        while (!src.isEmpty()) {
            Integer nextValue = src.pop();
            minVal = nextValue < minVal? nextValue: minVal;
            dest.push(nextValue);
        }

        return minVal;
    }

    private static void moveItems(Deque<Integer> src, Deque<Integer> dest) {
        while (!src.isEmpty()) {
            dest.push(src.pop());
        }
    }


}
