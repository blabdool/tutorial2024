package edu.nileuniversity;
import java.util.LinkedList;

public class ExampleLinkedList {
    public static void main(String[] args) {
        LinkedList<String>colours = new LinkedList<String>();
        colours.add("White");
        colours.add("Black");
        colours.add("Green");
        colours.add("Blue");
        System.out.println(colours);

        colours.addFirst("Red");
        System.out.println(colours);
    }

}
