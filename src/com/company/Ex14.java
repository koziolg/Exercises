package com.company;

import java.util.Stack;

public class Ex14 {
    public int solution(int[] H) {
       int result =0;
       Stack<Integer> stack = new Stack<>();

       for(int i = 0; i < H.length;i++){
           if(stack.empty()){
               stack.push(H[i]);
               result++;
           } else {
               while(!stack.empty() && stack.peek() > H[i]){
                   stack.pop();
               }
               if (!stack.empty() && stack.peek() == H[i]){
                   continue;
               } else {
                   stack.push(H[i]);
                   result++;
               }
           }
       }
       return result;
    }
}
