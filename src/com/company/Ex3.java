package com.company;

import java.util.Arrays;

public class Ex3 {

    public int solution(int[] A) {


        int result = 1;
        Arrays.sort(A);

        if (A.length == 0 || A[0] != 1) {
            result = 1;
        } else if (A[0] == 1 && A.length == 1) {
            result = 2;
        } else {
            for (int i = 0; i < A.length - 1; i++) {
                if (A[i + 1] - A[i] != 1) {
                    result = A[i] + 1;
                    break;
                } else {
                    result = A[i] + 2;
                }
            }

        }
        return result;


    }
}