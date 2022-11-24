package org.example;

import java.util.Arrays;

public class TheArrays {
    public static void main(String[] args) {
        String[] colors = new String[5];
        colors[0] = "purple";
        colors[1] = "blue";
        colors[2] = "yellow";

        System.out.println(Arrays.toString(colors));
        System.out.println(colors[0]);
        System.out.println(colors[4]);

        int[] number = {100,200};
        System.out.println(Arrays.toString(number));
        System.out.println("Normal loop");
        for (int i = 0; i < colors.length ; i++){
            System.out.println(colors[i]);
        }
        System.out.println("reverse loop");
        for (int i = colors.length -1; i >= 0; i--){
            System.out.println(colors[i]);
        }

        for(String color: colors){
            System.out.println(color);
        }

        Arrays.stream(colors).forEach(System.out::println);
    }

}
