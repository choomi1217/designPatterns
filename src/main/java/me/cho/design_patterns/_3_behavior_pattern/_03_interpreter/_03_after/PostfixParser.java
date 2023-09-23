package me.cho.design_patterns._3_behavior_pattern._03_interpreter._03_after;

import java.util.Stack;

public class PostfixParser {
    public static PostfixExpression parse(String s) {
        Stack<PostfixExpression> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            switch (c){
                case '+':
                    stack.push(PostfixExpression.plus(stack.pop(), stack.pop()));
                    break;
                case '-':
                    PostfixExpression right  = stack.pop();
                    PostfixExpression left = stack.pop();
                    stack.push(PostfixExpression.minus(left, right));
                    break;
                default:
                    stack.push(PostfixExpression.variable(c));
            }
        }
        return stack.pop();
    }
}
