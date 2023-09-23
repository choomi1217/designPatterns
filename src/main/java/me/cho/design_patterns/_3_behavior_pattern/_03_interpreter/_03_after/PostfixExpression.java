package me.cho.design_patterns._3_behavior_pattern._03_interpreter._03_after;

import java.util.Map;

public interface PostfixExpression {
    int interpret(Map<Character, Integer> variables);

    static PostfixExpression plus(PostfixExpression left, PostfixExpression right) {
        return context -> left.interpret(context) + right.interpret(context);
    }


    static PostfixExpression minus(PostfixExpression left, PostfixExpression right) {
        return context -> left.interpret(context) - right.interpret(context);
    }

    static PostfixExpression variable(char variable) {
        return context -> context.get(variable);
    }
}
