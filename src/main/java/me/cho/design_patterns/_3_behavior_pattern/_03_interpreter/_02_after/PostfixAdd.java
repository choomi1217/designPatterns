package me.cho.design_patterns._3_behavior_pattern._03_interpreter._02_after;

import java.util.Map;

public class PostfixAdd implements PostfixExpression {

    private PostfixExpression left, right;
    public PostfixAdd(PostfixExpression left, PostfixExpression right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public int interpret(Map<Character, Integer> variables) {
        return left.interpret(variables) + right.interpret(variables);
    }
}
