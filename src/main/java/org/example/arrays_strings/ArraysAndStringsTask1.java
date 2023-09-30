package org.example.arrays_strings;

/**
* Implement an algorithm to determine if a string has all unique characters.
* What if you cannot use additional data structures?
* <p>
* Status: completed
* <p>
* */
public class ArraysAndStringsTask1 {
    private static final int ASCII_SET_SIZE = 128;

    // TODO: 05/09/2023 cross review with given solution
    /**
    * Solution 1:
    * O(n) in time as we walk over the string only once
    * O(1) in memory as we only store 128 booleans independent of the string size
    * */
    public static boolean hasAllUnique(String input) {
        boolean[] charCodes = new boolean[ASCII_SET_SIZE];
        for (int i = 0; i < input.length(); i++) {
            int nextCharCode = input.charAt(i);
            if (charCodes[nextCharCode]) {
                return  false;
            }
            charCodes[nextCharCode] = true;
        }

        return true;
    }
}
