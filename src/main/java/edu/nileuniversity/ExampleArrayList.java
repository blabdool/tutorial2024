package edu.nileuniversity;
import java.util.ArrayList; //import the ArrayList class
import java.util.Collections;

public class ExampleArrayList {
    public static void main(String[] args) {
        ArrayList<String>names = new ArrayList<String>(); //creating cars which is an instance of the ArrayList class

        //There are series of methods that are available in the ArrayList class as follows:

        names.add("Tom"); //Add items
        names.add("Mike");
        names.add("Matt");
        names.add("Nick");
        System.out.println(names);

        names.size(); // ArrayList Size
        System.out.println(names.size());

        names.get(0); //Access an item

        names.set(0,"Tommy");//Change an item
        System.out.println(names);

        for (String i:names){
            System.out.println("Name is "+i);
        }

        //Remove an item with



    }
}
