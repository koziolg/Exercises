package com.company;

import java.util.Arrays;

public class Ex4 {

    public int solution(int[] A) {
        Arrays.sort(A);
        int result = 1;
        for(int i = 0; i < A.length; i++){
            if(i+1 != A[i]){
                result = 0;
            }
        }
        return result;
    }
}
