package edu.nileuniversity;

import java.util.LinkedList;

public class ExampleLL {
    public static void main(String[] args) {
        LinkedList<String> cars = new LinkedList<>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Mazda");
        cars.add("Ford");
        System.out.println(cars);

        //Linked List has special methods
        cars.addFirst("Honda");
        cars.addLast("Lexus");
        System.out.println(cars);
        //others include removeFirst(), removeLast(), getFirst(), getLast()

    }
}
