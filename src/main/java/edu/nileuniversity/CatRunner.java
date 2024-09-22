package edu.nileuniversity;

public class CatRunner {
    public static void main(String[] args) {
        //Creating cat 1 and assigning values to its attributes
       /* Cat cat1 = new Cat();
        cat1.name = "Opal";
        cat1.age = 11;
        cat1.favouriteFood = "Mice";
        System.out.println("Hello, I am "+ cat1.name+ " ");
        cat1.eat();

        //Creating cat 2 and assigning values to its attributes
        Cat cat2 = new Cat();
        cat2.name = "Tiger";
        cat2.age = 15;
        cat2.favouriteFood = "BlueJ";
        System.out.println(cat2.favouriteFood);
        cat2.play();
        cat2.eat();

        //Creating cat 3 and assigning values to its attributes
        Cat cat3 = new Cat();
        cat3.name = "Misty";
        cat3.age = 5;
        cat3.favouriteFood = "Chicken";
        cat3.play();

        Cat cat10 = new Cat();
        System.out.println(cat10.name);
        System.out.println(cat10.age);
        System.out.println(cat10.favouriteFood);*/

//        Creating cat 4 and assigning values to its attributes constructor
        Cat cat4 = new Cat("Mimi", 2, "Fish");
        Cat cat5 = new Cat("Pussycat", 5,"Meat");
        System.out.println(cat4.age);
        System.out.println(cat5.favouriteFood);
        cat5.play();


    }
}
