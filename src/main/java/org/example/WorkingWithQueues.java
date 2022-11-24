package org.example;

import java.util.LinkedList;
import java.util.Objects;
import java.util.Queue;

public class WorkingWithQueues {
    public static void main(String[] args) {
      Queue<Person> queue = new LinkedList<>();

      queue.add(new Person("Joao"));
      queue.add(new Person("Jose"));
      queue.add(new Person("Maria"));
        System.out.println(queue.size());
        System.out.println(queue.peek());
        System.out.println(queue.poll());
        System.out.println(queue.size());
        System.out.println(queue.peek());

    }

    public static class Person{
        String name;

        public Person(String name) {
            this.name = name;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (!(o instanceof Person)) return false;
            Person person = (Person) o;
            return Objects.equals(name, person.name);
        }

        @Override
        public int hashCode() {
            return Objects.hash(name);
        }

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    '}';
        }
    }
}
