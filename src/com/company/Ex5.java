package com.company;

import java.util.HashSet;
import java.util.Set;

public class Ex5 {

    public int solution(int X, int[] A) {
        int result = -1;
        Set<Integer> jumps = new HashSet<>();
        for(int i = 0; i < A.length; i++){
            if(jumps.add(A[i])) {
                X--;
                if (X == 0) {
                    result = i;
                }
            }
        }
        return result;
    }
}
