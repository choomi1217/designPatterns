package me.cho.design_patterns._3_behavior_pattern._03_interpreter._02_after;

import java.util.Map;

public class VariableExpression implements PostfixExpression {
    Character variable;
    public VariableExpression(char c) {
        variable = c;
    }

    @Override
    public int interpret(Map<Character, Integer> map) {
        return map.get(variable);
    }
}
