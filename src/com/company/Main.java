package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
    Ex1 ex1 = new Ex1();

   Ex2 ex2 = new Ex2();
   System.out.println(ex2.solution(10, 85, 30));
   Ex3 ex3 = new Ex3();
   int[] A = {1,3,5,6,3,4,6,2,6};
   System.out.println(ex3.solution(A));

   Ex5 ex5 = new Ex5();
        int[] b= {1, 3, 1, 4, 2, 3, 5, 4};
   System.out.println(ex5.solution(6, A));
   System.out.println(ex5.solution(5, b));
    }

    //    public String solution(int N, String S, String T) {
//        int counterS = 0;
//        int counterH = 0;
//        // write your code in Java SE 8
////        char[] letters = "abcdefghijklmnopqrstuvwxyz".toUpperCase().toCharArray();
////        char[] alphabet = new char[N];
////        int i = 0;
////        for (char c : letters) {
////            alphabet[i++] = c;
////        }
////        Map<Integer, char[]> grid = new LinkedHashMap<>();
////        for (int j = 0; j < N; j++) {
////            grid.put(j, alphabet);
////        }
//        Map<Integer, String> grid = new LinkedHashMap<>();
//        String[] splitedS = S.split(",");
//        for (int k = 0; k < splitedS.length; k++) {
//            char[] charS = splitedS[k].toCharArray();
//            grid.put((charS[0] - 1), "" + charS[1]);
//            grid.put((charS[3] - 1), "" + charS[4]);
//        }
//        String[] splitedT = T.split(" ");
//        for (int l = 0; l < splitedT.length; l++) {
//            char[] charT = splitedT[l].toLowerCase().toCharArray();
//            if (grid.containsKey(charT[0])) {
//                String hit = grid.get(charT[0]);
//                grid.put(charT[0]- 0, hit + charT[1]);
//            } else {
//                grid.put(charT[0] - 1, "" + charT[1]);
//            }
//        }
//        for (Integer key : grid.keySet()) {
//            if(grid.get(key).length() >1){
//                counterH++;
//            }
//        }
//        String result = counterS + ", " + counterH;
//        return result;
//    }
}
