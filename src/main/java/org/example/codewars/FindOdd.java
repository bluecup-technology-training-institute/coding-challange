package org.example.codewars;

public class FindOdd {
    public static int findIt(int[] A) {
        int xor = 0;
        for (int i = 0; i < A.length; i++) {
            int c = A[i];
            xor = xor ^ A[i];
        }
        return xor;
    }
}
