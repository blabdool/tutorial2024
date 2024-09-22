package edu.nileuniversity;

import java.util.ArrayList;
import java.util.Iterator;

public class ExampleIterator {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<String>(); //creating cars which is an instance of the ArrayList class
        names.add("Tom"); //Add items
        names.add("Mike");
        names.add("Matt");
        names.add("Nick");

        // iterator returns an iterator object
        Iterator<String> iterator = names.iterator();
        while (iterator.hasNext()){
            System.out.println("Name is: "+iterator.next());
        }
    }



}
