package com.company;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class Ex16 {
    public int solution(String S) {
        int result = 0;
        if(S == null || S.length()%2 != 0){
            result =  0;
        } else if ( S.isEmpty()){
            result = 1;
        }
//        else if (S.length()%2 == 0) {
//            char[] charArray = S.toCharArray();
//            int j = charArray.length / 2;
//            for (int i = charArray.length / 2; i < charArray.length; i++ ){
//                if(charArray[j] == charArray[i]){
//                    result = 1;
//                } else if (charArray[j] != charArray[i])  {
//                    result = 0;
//                }
//                j--;
//            }
//        }
        char[] charArray = S.toCharArray();
        Map<Character, Character> brackets = new HashMap<Character, Character>();
        brackets.put(')', '(');
        Stack<Character> stack = new Stack<>();
        for(int i = 0; i < charArray.length;i++){
            if(brackets.containsKey(charArray[i])){
                if(!stack.empty() && brackets.get(charArray[i]) ==stack.peek()){
                    stack.pop();
                } else {
                    result = 0;
                }
            } else {
                stack.push(charArray[i]);
            }
        }
        if(stack.empty()){
            result = 1;
        }
        return result;
    }
}
