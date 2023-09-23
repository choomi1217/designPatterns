package me.cho.design_patterns._3_behavior_pattern._03_interpreter._05_spring;

import org.springframework.expression.Expression;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;

public class InterpreterInSpring {
    public static void main(String[] args) {
        Book book = new Book("Spring");
        ExpressionParser parser = new SpelExpressionParser();
        Expression expression = parser.parseExpression("title");
        System.out.println(expression.getValue(book));


    }
}
