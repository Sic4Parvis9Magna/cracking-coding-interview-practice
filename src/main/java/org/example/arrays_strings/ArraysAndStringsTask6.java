package org.example.arrays_strings;

/**
 * Given image represent by an NxN matrix, where each pixel in the image is 4 bytes,
 * write a method to rotate image by 90 degrees.
 * Can you do this in place?
 */
public class ArraysAndStringsTask6 {
    public static void rotate(byte[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = i; j < matrix[0].length; j++) {
                swap(i,j,matrix);
            }
        }
    }

    private static void swap(int i, int j, byte[][] matrix) {
        byte tmp = matrix[i][j];
        matrix[i][j] = matrix[j][i];
        matrix[i][j] = tmp;
    }
}
