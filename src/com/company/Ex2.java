package com.company;

public class Ex2 {

    public int solution(int X, int Y, int D) {

        double dist = (Y-X)/D;
        if((Y-X)%D>0){
            dist += 1;
        }
        return  (int) dist;

    }
}
