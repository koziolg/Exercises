package com.company;

import java.util.stream.IntStream;

public class Ex8 {
    public int solution(int A, int B, int K) {

        // Count Div

        int result = 0;
        if(A%K== 0){
            result = (B-A)/K+1;
        } else {
            result = (B-(A-A%K))/K;
        }

        return result;


//

//        long result = IntStream.range(A,B).filter(value -> value%K==0).count();
//        return (int) result;
    }
}
