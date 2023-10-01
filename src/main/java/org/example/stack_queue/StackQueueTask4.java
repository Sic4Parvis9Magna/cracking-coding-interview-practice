package org.example.stack_queue;

import java.util.Deque;

/**
 * In the classic problem of the Towers of Hanoi, you have 3 towers and N disks of different sizes which can slide onto any tower.
 * The puzzle starts with disks sorted in ascending order of size from top to bottom (i.e., each disk sits on top of an even larger one).
 * You have the following constrains:
 * (1) Only one disk can be moved at a time.
 * (2) A disk is slid off the top of one tower onto the next tower.
 * (3) A disk can only be placed on top of a larger disk.
 * Write a program to move disks from the first tower to the last tower using stacks.
 */
public class StackQueueTask4 {

    public static void moveDisksRecursively(Deque<Integer> src, Deque<Integer> tmp, Deque<Integer> dest) {
        recursiveMove(src.size(), src,tmp,dest);
    }

    private static void recursiveMove(int disks, Deque<Integer> src, Deque<Integer> dest, Deque<Integer> tmp) {
        if (disks>0) {
            recursiveMove(disks -1, src, tmp, dest);
            Integer nextDisk = src.pop();
            dest.push(nextDisk);
            recursiveMove(disks -1,tmp,dest,src);
        }
    }

    // TODO: 30/09/2023 add non recursive approach

}
