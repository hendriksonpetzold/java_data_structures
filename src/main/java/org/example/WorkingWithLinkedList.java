package org.example;

import java.util.LinkedList;
import java.util.ListIterator;

public class WorkingWithLinkedList {

    public static void main(String[] args) {
        Integer counter = 0;
        LinkedList<Integer> numbers = new LinkedList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        ListIterator<Integer> numbersIterator = numbers.listIterator();

        while(numbersIterator.hasNext()){
            System.out.println(counter++);
            System.out.println(numbersIterator.next());
        }
        while(numbersIterator.hasPrevious()){
            System.out.println(counter++);
            System.out.println(numbersIterator.previous());
        }
    }
}
