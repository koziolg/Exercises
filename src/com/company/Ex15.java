package com.company;

import java.util.Stack;

public class Ex15 {
    public int solution(int[] A, int[] B) {
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < A.length; i++) {
            if (stack.empty()) {
                stack.push(i);
            } else {
                while (!stack.empty() && B[i] - B[stack.peek()] == -1 && A[stack.peek()] < A[i]) {
                    stack.pop();
                }
                if (!stack.empty()){
                    if(B[i] - B[stack.peek()] != -1){
                        stack.push(i);
                    }
                } else
                    stack.push(i);
            }

        }

        return stack.size();
    }

}
