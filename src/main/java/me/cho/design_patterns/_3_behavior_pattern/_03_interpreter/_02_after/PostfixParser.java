package me.cho.design_patterns._3_behavior_pattern._03_interpreter._02_after;

import java.util.Stack;

public class PostfixParser {
    public static PostfixExpression parse(String s) {
        Stack<PostfixExpression> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            switch (c){
                case '+':
                    stack.push(new PostfixAdd(stack.pop(), stack.pop()));
                    break;
                case '-':
                    PostfixExpression right  = stack.pop();
                    PostfixExpression left = stack.pop();
                    stack.push(new PostfixSubtract(left, right));
                    break;
                default:
                    stack.push(new VariableExpression(c));
            }
        }
        return stack.pop();
    }
}
