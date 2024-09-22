package edu.nileuniversity;

public class Cat {
    String name;
    int age;
    String favouriteFood;

    static  void meow(){
        System.out.println("I can meow");
    }
    public  void play(){
        System.out.println("I am playing");
    }
    public  void eat(){
        System.out.println("I am eating");
    }

    //Constructor non-parameterized
    public Cat(){
        name = "Kitty";
        age = 0;
        favouriteFood = "fish";
    }
    //Constructor parameterized.
   public Cat(String cname, int cAge, String ff){
       name = cname;
       age = cAge;
       favouriteFood = ff;

    }

    public static void main(String[] args) {
        meow();

    }
}
