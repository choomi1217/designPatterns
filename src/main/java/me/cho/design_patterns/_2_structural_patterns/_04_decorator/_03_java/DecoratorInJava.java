package me.cho.design_patterns._2_structural_patterns._04_decorator._03_java;

import javax.servlet.http.HttpServletRequestWrapper;
import javax.servlet.http.HttpServletResponseWrapper;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DecoratorInJava {

    public static void main(String[] args) {
        ArrayList list = new ArrayList<>();
        list.add(new Book());

        List books = Collections.checkedList(list, Book.class);

        list.add(new Item());
        books.add(new Item());

        HttpServletRequestWrapper requestWrapper;
        HttpServletResponseWrapper responseWrapper;

    }

    private static class Book{

    }

    private static class Item{

    }

}
