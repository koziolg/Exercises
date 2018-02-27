package com.company;

import java.util.Arrays;

public class Ex13 {
    public int solution(String S) {
        if(S.length()%2 != 0){
            return 0;
        }
        String[] firstSplit = S.split("(.*)");
        String secondString = Arrays.toString(firstSplit);
        String[] secondSplit = secondString.split("[.*]");
        String lastString = Arrays.toString(secondSplit);
        String[] lastSplit = lastString.split("{.*}");



    }
}
