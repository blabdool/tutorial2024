package edu.nileuniversity;

import java.util.HashMap; //Import HashMap class

public class ExampleHashMap {
    public static void main(String[] args) {
        HashMap<String,String> capitalCities = new HashMap<>();

        //Add Items
        capitalCities.put("USA", "Washington");
        capitalCities.put("Germany", "Berlin");
        capitalCities.put("England", "London");
        capitalCities.put("Norway", "Oslo");
        capitalCities.put("Japan", "Tokyo");
        capitalCities.put("US", "Washington");
        capitalCities.put("German", "Berlin");
        System.out.println(capitalCities);

        //Access an item
        capitalCities.get("England");
        //System.out.println(capitalCities.get("England"));

        //Remove an item
       /* capitalCities.remove("England");
        System.out.println(capitalCities);*/

        //HashMap size
       /*capitalCities.size();
        System.out.println(capitalCities.size());*/

        //Loop through a HashMap
        /*for(String i:capitalCities.keySet()){
            System.out.println(i);
        }*/

        //Loop through a HashMap value set
       /* for(String i:capitalCities.values()){
            System.out.println(i);
        }*/

        //Loop through a HashMap key and value set
        for(String i:capitalCities.keySet()){
            System.out.println(i+"'s capital is "+capitalCities.get(i));
        }

    }



}
