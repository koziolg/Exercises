package com.company;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Ex1 {

    public int solution(int[] A) {
        int result = 0;
     //   int[] tmpArr = new int[A.length - 1];
        int fP = 0, sP = 0;

        // sol1

        //    for(int i = 1; i < A.length;i++){
//
//            for(int j = 0; j < i; j++){
//                fP += A[j];
//            }
//            for(int k = i; k < A.length; k++){
//                sP +=A[k];
//            }
//
//            tmpArr[i-1] = Math.abs(fP-sP);
//        }
//

        // sol2

//        List<Integer> list = IntStream.of(A).boxed().collect(Collectors.toList());
//        for(int i = 1; i < A.length;i++){
//            fP = list.subList(0, i).stream().mapToInt(Integer::intValue).sum();
//            sP = list.subList(i, A.length).stream().mapToInt(Integer::intValue).sum();
//            if(fP-sP <0) {
//                tmpArr[i - 1] = (fP - sP)*(-1);
//            } else {
//                tmpArr[i - 1] = fP - sP;
//            }
//            System.out.println(fP- sP);
//        }
//
//        result = Arrays.stream(tmpArr).min().getAsInt();

        // sol3

        for (int i = 1; i < A.length; i++) {
            sP += A[i];
        }
        fP = A[0];

        result = Math.abs(fP - sP);

        for (int j = 1; j < A.length-1; j++) {
            if (Math.abs(fP - sP) < result) {
                result = Math.abs(fP - sP);
            }
            fP +=A[j];
            System.out.println(fP);
            sP -=A[j];
            System.out.println("sP"+ sP);
        }

        return result;
    }
}
