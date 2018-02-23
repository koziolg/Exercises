package com.company;

public class Ex9 {

    public int solution(int[] A) {
        int a=0;
        int result = 0;
        for (int i = 0; i < A.length; i++) {
            if (A[i] == 0) {
                a++;
            } else if(A[i] == 1){
                result = result + a;
            }
            if (result > 1000000000){
                return -1;
            }

        }

        return result;
    }
}
