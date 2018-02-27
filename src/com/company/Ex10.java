package com.company;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Ex10 {

    public int solution(int[] A) {

        // distinic


        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < A.length; i++) {
            set.add(A[i]);
        }
        int result = set.size();

        // too slow

//        List<Integer> list = IntStream.of(A).boxed().collect(Collectors.toList());
//       return (int) list.stream().distinct().count();
        return result;
    }
}
