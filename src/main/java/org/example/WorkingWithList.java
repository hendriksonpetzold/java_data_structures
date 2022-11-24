package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WorkingWithList {
    public static void main(String[] args) {
        List<String> colorsUnmodifiable = List.of("blue", "yellow");

        List<String> colors = new ArrayList();
        colors.add("blue");
        colors.add("yellow");
        colors.add("red");

        System.out.println(colors);
        System.out.println(colors.size());
        System.out.println(colors.contains("yellow"));
        System.out.println(colors.contains("purple"));
        System.out.println("for in loop");
        for(String color : colors){
            System.out.println(color);
        }
        System.out.println("for loop");
        for(int i = 0; i< colors.size(); i++){
            System.out.println(colors.get(i));
        }

        System.out.println("forEach loop");
        colors.forEach(System.out::println);
    }
}
