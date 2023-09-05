package org.example.arrays_strings;
/**
 * Implement a function void reverse(char* str) im C or C++ which reverses a null terminated string
 * Here I'll do java version of it
 * <p>
 * Status: completed
 * <p>
 */
public class ArraysAndStringsTask2 {

    // TODO: 05/09/2023 cross review with given solution
    /**
     * Solution 1:
     * O(n) in time as we walk over the string only once
     * O(1) in memory do not need to store any of additional data
     * */
    public static void reverse(char[] charArr) {
        int left = 0;
        int right = charArr.length - 1;
        while (left < right) {
            swap(charArr, left, right);
            left++;
            right--;
        }
    }

    private static void swap(char[] arr, int i, int j) {
        char tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }
}
