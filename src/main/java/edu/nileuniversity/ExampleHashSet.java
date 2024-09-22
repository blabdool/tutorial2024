package edu.nileuniversity;
import java.util.HashSet; //import the class HashSet from the java.util package

public class ExampleHashSet {
    public static void main(String[] args) {
        HashSet<String> cars = new HashSet<>();
        cars.add("BMW");
        cars.add("Volvo");
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Mazda");
        cars.add("BMW");
        cars.add("Ford");
        System.out.println(cars);

        //Check if an item exists
        cars.contains("Audi"); //what do you think this code will evaluate to?
        System.out.println(cars.contains("Audi"));

        //Other methods include clear(), size()

        //Loop through using for-each loop
        for(String i:cars){
            System.out.println(i);
        }

    }
}
