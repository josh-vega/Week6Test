package com.example.week6test;

import android.util.LruCache;

import java.util.Deque;
import java.util.HashSet;
import java.util.Stack;

public class Problem5 {

    public static void main(String[] args){
        System.out.println("*****Problem 5*****");
        System.out.println("({})[] = " + check("({})[]"));
        System.out.println("[]{]}[ = " + check("[]{]}["));
        System.out.println();
    }

    public static boolean check(String input){
        Stack<Character> stack = new Stack<>();
        for(int i=0; i<input.length(); i++){
            char c = input.charAt(i);
            if(c == '[' || c == '{' || c == '('){
                stack.push(c);
            } else if(c == ']'){
                if(stack.isEmpty() || stack.pop() != '['){
                    return false;
                }
            } else if(c == '}'){
                if(stack.isEmpty() || stack.pop() != '{'){
                    return false;
                }
            } else if( c == ')'){
                if(stack.isEmpty() || stack.pop() != '('){
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}
