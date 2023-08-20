package me.cho.design_patterns._3_behavior_pattern._03_interpreter._02_after;

import java.util.Map;

public interface PostfixExpression {
    int interpret(Map<Character, Integer> variables);
}
