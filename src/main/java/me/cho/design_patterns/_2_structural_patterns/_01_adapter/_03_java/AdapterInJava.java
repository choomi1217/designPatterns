package me.cho.design_patterns._2_structural_patterns._01_adapter._03_java;

import java.io.*;
import java.util.*;

public class AdapterInJava {

    public static void main(String[] args) {
        //Collections
        List<String> strings = Arrays.asList("a", "b", "c");
        Enumeration<String> enumeration = Collections.enumeration(strings);
        ArrayList<String> list = Collections.list(enumeration);

        //Io
        try(InputStream is = new FileInputStream("input.txt");
            InputStreamReader isr = new InputStreamReader(is);
            BufferedReader reader = new BufferedReader(isr);){
            while (reader.ready()){
                System.out.println(reader.readLine());
            }
        }catch (IOException e){
            throw new RuntimeException(e);
        }

    }

}
