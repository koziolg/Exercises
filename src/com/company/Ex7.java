package com.company;

public class Ex7 {

    public int[] solution(int N, int[] A) {

        // Max counters

        int[] result = new int[N];
        int counter = 0, maxCounter = 0;
        for (int i = 0; i < A.length; i++) {
            if (A[i] >= 1 && A[i] <= N) {
                if (result[A[i] - 1] < counter) {
                    result[A[i] - 1] = counter;
                }

                result[A[i] - 1] = result[A[i] - 1] + 1;
                if (result[A[i] - 1] > maxCounter) {
                    maxCounter = result[A[i] - 1];
                }

            } else  {
                counter = maxCounter;
            }
        }
        for (int j = 0; j < result.length; j++) {
            if (result[j] < counter) {
                result[j] = counter;
            }
        }
        return result;
    }
}
