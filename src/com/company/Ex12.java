package com.company;

import java.util.Arrays;

public class Ex12 {

    public int solution(int[] A) {
        Arrays.sort(A);
        int result = A[0] * A[0 + 1] * A[A.length - 1];
        for (int i = 1; i < A.length - 2; i++) {
            if (A[i] * A[i + 1] * A[i + 2] > result) {
                result = A[i] * A[i + 1] * A[i + 2];
            }
        }

        return result;
    }
}
