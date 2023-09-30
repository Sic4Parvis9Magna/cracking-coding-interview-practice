package org.example.arrays_strings;
/**
* Given two strings, write a method to decide if one is a permutation of the other
* <p>
* Status: completed
* <p>
* */
public class ArraysAndStringsTask3 {
    private static final int ASCII_SET_SIZE = 128;

    // TODO: 05/09/2023 cross review with given solution
    /**
     * Solution 1:
     * O(n1+n2) in time as we walk over the strings only once
     * O(1) in memory as we only store 128 int independent of the string size
     * */
    public static boolean isPermutationString(String s1, String s2) {
        int[] charMap = countChars(s1);

        return isSameChars(s2, charMap);
    }

    private static boolean isSameChars(String str, int[] charMap) {
        for (int i = 0; i < str.length(); i++) {
            int nextCharCode = str.charAt(i);
            if (charMap[nextCharCode] == 0) {
                return false;
            }
            charMap[nextCharCode] -= 1;
        }
        for (int i = 0; i < ASCII_SET_SIZE; i++) {
            if (charMap[i] != 0) {
                return false;
            }
        }
        return true;
    }

    private static int[] countChars(String str) {
        int[] charMap = new int[ASCII_SET_SIZE];
        for (int i = 0; i < str.length(); i++) {
            int nextCharCode = str.charAt(i);
            charMap[nextCharCode] += 1;
        }

        return charMap;
    }
}
