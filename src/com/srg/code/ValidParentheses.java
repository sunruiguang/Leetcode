package com.srg.code;

import java.util.Stack;

public class ValidParentheses {
    public static void main(String[] args) {
        System.out.println(isValid("{[]}"));
    }

    private static boolean isValid(String s) {
        if (s == null || s.length() == 0)
            return true;
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{') {
                stack.push(s.charAt(i));
            } else if (stack.isEmpty()) {
                return false;
            } else if (s.charAt(i) == ')' && stack.pop() != '(') {
                return false;
            } else if (s.charAt(i) == ']' && stack.pop() != '[') {
                return false;
            } else if (s.charAt(i) == '}' && stack.pop() != '{') {
                return false;
            }
        }
        return stack.isEmpty();
    }
}
