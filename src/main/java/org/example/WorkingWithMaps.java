package org.example;

import java.util.HashMap;
import java.util.Map;

public class WorkingWithMaps {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "Jose");
        map.put(2, "Joao");
        map.put(3, "Maria");
        System.out.println(map);
        System.out.println(map.size());
        System.out.println(map.get(1));
        System.out.println(map.keySet());
        System.out.println(map.entrySet());
    }
}
