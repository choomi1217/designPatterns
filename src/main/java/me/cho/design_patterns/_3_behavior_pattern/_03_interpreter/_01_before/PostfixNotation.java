package me.cho.design_patterns._3_behavior_pattern._03_interpreter._01_before;

import java.util.Collection;
import java.util.Collections;
import java.util.Stack;

public class PostfixNotation {
    private final String expression;

    public PostfixNotation(String expression) {
        this.expression = expression;
    }

    public static void main(String[] args) {
        Collections collections;
        Collection collection;
        PostfixNotation postfixNotation = new PostfixNotation("123+-");
        postfixNotation.calculate();
    }

    private void calculate() {
        Stack<Integer> stack = new Stack<>();
        for (char c : expression.toCharArray()) {
            switch (c){
                case '+':
                    stack.push(stack.pop() + stack.pop());
                    break;
                case '-':
                    stack.push(stack.pop() - stack.pop());
                    break;
                case '*':
                    stack.push(stack.pop() * stack.pop());
                    break;
                case '/':
                    stack.push(stack.pop() / stack.pop());
                    break;
                default:
                    stack.push(Integer.parseInt(String.valueOf(c)));
            }
        }
        System.out.println("result : " + stack.pop());
    }
}
