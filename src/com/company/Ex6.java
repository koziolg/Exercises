package com.company;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.IntStream;

public class Ex6 {

    public int solution(int[] A) {
        int result = 1;
        int[] lol = IntStream.of(A).sorted().map(i -> j - i).toArray();
        System.out.println(Arrays.toString(lol));
//        Set<Integer> set = new TreeSet<>();
//        Arrays.sort(A);
//        for (int i = 0; i < A.length; i++) {
//            set.add(A[i]);
//        }
//        int[] b = new int[set.size()];
//        Iterator iterator = set.iterator();
//        int i = 0;
//        while (iterator.hasNext()) {
//            b[i] = (int) iterator.next();
//            i++;
//        }
//        for (int j = 0; j < b.length - 1; j++) {
//            if (b[j] < 0) {
//                continue;
//            } else if (b[j + 1] - b[j] != 1) {
//                result = b[j] + 1;
//            } else {
//                result = b[b.length] +1;
//            }
//        }
        return result;
    }
}
