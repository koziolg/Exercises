package com.company;

import java.util.HashSet;
import java.util.Set;

public class Ex6 {

    public int solution(int[] A) {
        // missing int
        int result = 1;
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < A.length; i++) {
            set.add(A[i]);
        }
        while (set.contains(result)) {
            result++;
        }
        return result;
    }
}
